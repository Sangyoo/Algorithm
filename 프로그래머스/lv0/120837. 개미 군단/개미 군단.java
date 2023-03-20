import java.util.*;
class Solution {
    public int solution(int hp) {
        int[] abilities = new int[]{5,3,1};
        int answer = calc(hp, abilities);
        return answer;

        
    }
    public static int calc(int a, int[] array){
        if(array.length == 1) return a;
        return a/array[0] +calc( a - (a/array[0] * array[0]), Arrays.copyOfRange(array, 1, array.length));
    }

}