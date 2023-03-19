class Solution {
    public int solution(int n) {
        int result = 0;
        for(int i=1; i<= Math.sqrt(n); i++) {
            if(n%i == 0) {
                if(Math.sqrt(n) == i){
                    result ++;
                }
                else result+=2;
            }
        }
        return result;
    }
}