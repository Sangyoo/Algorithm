import java.util.*;

class Solution {
    public int solution(int[] array) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        Arrays.stream(array).forEach(i-> sb.append(String.valueOf(i)));
        for(String s : sb.toString().split("")){
            if(s.equals("7")) answer++;
        }
        return answer;
    }
}