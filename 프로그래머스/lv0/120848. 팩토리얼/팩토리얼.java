class Solution {
    public int solution(int n) {
        int i = 2;
        while(factorial(i) <= n){
            if(factorial(i)==n) return i;
            i++;
        }
        return i-1;
    }
    public static int factorial(int n){
        if(n<2) return 1;
        return n*factorial(n-1);
    }
}