class Solution {
    public int solution(int[] numbers, int k) {
       // 2k-2 가 k번째로 공을 던지는 사람의 index
       // 그렇지만 그 index는 length-1를 넘을 수 없다.
        int len = numbers.length;
        return numbers[((2*k-2) % len)];
    }
}