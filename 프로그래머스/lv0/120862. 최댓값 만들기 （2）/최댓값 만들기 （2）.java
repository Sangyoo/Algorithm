import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int cand1 = numbers[0] * numbers[1];
        int cand2 = numbers[numbers.length-1] * numbers[numbers.length-2];
        return cand1 >= cand2 ? cand1 : cand2;
    }
}