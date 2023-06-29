import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] array, int n) {
        int[] diff = Arrays.stream(array).map(a->Math.abs(a-n)).toArray();
        Integer min = Arrays.stream(array).map(a->Math.abs(a-n)).min().orElse(-1);
        List<Integer> minIdxs = new ArrayList<>();
        for(int i =0; i<diff.length; i++){
            if(diff[i] == min) minIdxs.add(i);
        }
        return (int) minIdxs.stream().map(b-> array[b]).min(Comparator.comparing(x->x)).orElse(-1);
    }
}