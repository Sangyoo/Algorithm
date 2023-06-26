import java.util.*;
class Solution {
    public int solution(String before, String after) {
        // String[] befArr = before.split("");
        // String[] aftArr = after.split("");
        char[] befArr = before.toCharArray();
        char[] aftArr = after.toCharArray();
        
        Arrays.sort(befArr);
        Arrays.sort(aftArr);
        
        
        for(int i=0; i < befArr.length; i++){
            if(befArr[i] != aftArr[i]) return 0;
        }
        return 1;
    
    }
}