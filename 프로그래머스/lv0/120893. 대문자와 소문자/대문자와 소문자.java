import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] abc = my_string.toCharArray();
        for(char a : abc) {
            if(65<= a && a<= 90) sb.append((char) (a + 32));
            else if(97<= a && a<= 122) sb.append((char) (a - 32));
        }
        return sb.toString();
    }
}