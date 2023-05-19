class Solution {
    public int solution(int order) {
        int result = 0;
        while(order>0) {
            int rem = order % 10;
            if(rem != 0 && rem%3 == 0) result++;
            order = order / 10;
        }
        return result;
    }
}