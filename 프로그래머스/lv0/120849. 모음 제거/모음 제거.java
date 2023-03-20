import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] abc = my_string.toCharArray();
        for(char a : abc){
            if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                continue;
            }
            sb.append(a);
        }
        return sb.toString();
    }
}