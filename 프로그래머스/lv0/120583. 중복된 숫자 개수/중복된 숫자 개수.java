class Solution {
    public int solution(int[] array, int n) {
        int result = 0;
        for(int a : array) {
            if (a == n) result ++;
        }
        return result;
    }
}