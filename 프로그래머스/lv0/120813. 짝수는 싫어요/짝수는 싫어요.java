import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> abc = new ArrayList<Integer>();
        for(int i = 1; i<=n; i+=2) {
            abc.add(i);
        }
        return abc.stream().mapToInt(i->i).toArray();
    }
}