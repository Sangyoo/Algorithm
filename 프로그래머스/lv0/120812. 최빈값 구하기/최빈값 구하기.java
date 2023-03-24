import java.util.*;
class Solution {
    public int solution(int[] array) {
        
        List<Integer> numList = new ArrayList<>();
        Map<Integer, Integer> maps = new HashMap<>();
        for(int a : array){
            if(!numList.contains(a)){
                numList.add(a);
                maps.put(a, 1);
            }
            else {
                int z = maps.get(a);
                maps.replace(a, z+1);
            }
        }
        int maxNumber = 0;
        int max = 0;
        Set<Integer> keys = maps.keySet();
        for(Integer k : keys) {
            if(maps.get(k) > max) {
                max = maps.get(k);
                maxNumber = k;
            }
            else if(maps.get(k) == max) {
                max = -1;
            }
            else continue;
        }
        return max == -1 ? max : maxNumber;
    }
}