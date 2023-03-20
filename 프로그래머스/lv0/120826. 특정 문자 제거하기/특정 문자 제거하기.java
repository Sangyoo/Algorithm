import java.util.*;
class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        char[] abc = my_string.toCharArray();
        for(char a : abc) {
            if(letter.charAt(0) == a){
                continue;
            }
            sb.append(a);
        }
        return sb.toString();
    }
}