import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        char[] abc = my_string.toCharArray();
        int k = 0;
        for(int i=0; i<my_string.length(); i++){
            k = n;
            for(;k>0;k--){
                sb.append(abc[i]);
            }
        }
        return sb.toString();
    }
}