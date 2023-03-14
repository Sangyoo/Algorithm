import java.util.Arrays;
class Solution {
    public double solution(int[] numbers) {
        
        double A = Arrays.stream(numbers).reduce((a,b)-> a+b).orElse(0);
        double B = numbers.length;
        return A/B;
    }
}