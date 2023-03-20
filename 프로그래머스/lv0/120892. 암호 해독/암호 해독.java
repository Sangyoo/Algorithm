import java.util.*;

class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        char[] abc = cipher.toCharArray();
        int index = code -1;
        for(;index<abc.length;index+=code){
            sb.append(abc[index]);
        }
        return sb.toString();
    }
}