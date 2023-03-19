class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 최대공약수 구하기
        int p = gcd(denom1, denom2);
        
        // 최소공배수 구하기
        int q = denom1 * denom2 / p;
        // 분자의 합
        int z = ((q / denom2) * numer2) + ((q / denom1) * numer1);
        
        // 기약분수로 나타내기
        int r = gcd(z,q);
        if( r > 1) {
            return new int[]{z/r,q/r};
        }
        return new int[]{z,q};
        
        
    }
    
    // 최대공약수 구하는 메서드
    public static int gcd(int a, int b) {
        if(a > b) {
            if( b == 0) return a;
            return gcd(b, a%b);
        }
        if( a < b) {
            if( a == 0) return b;
            return gcd(a, b%a);
        }
        else return a;
    }
}