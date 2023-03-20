import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] abc = my_string.toCharArray();
        for(int i = my_string.length()-1; i>=0; i--){
            sb.append(abc[i]);
        }
        return sb.toString();
    }
}