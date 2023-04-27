class Solution {
    public int[] solution(int[] array) {
        int tempNum = 0;
        int tempIdx = 0;
        for(int i =0; i<array.length;i++) {
            if( tempNum < array[i]) {
                tempNum = array[i];
                tempIdx = i;
            }
        }
        return new int[]{tempNum, tempIdx};
    }
}