class Solution {
    public int solution(int[] box, int n) {
        int result = 1;
        for(int length : box) {
            result = result * (length / n);
        }
        return result;
    }
}