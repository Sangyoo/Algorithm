import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int a = (int) Arrays.stream(num_list).filter(n->n%2==0).count();
        int b = num_list.length - a;
        int[] answer = {a, b};
        return answer;
    }
}