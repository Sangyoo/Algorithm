import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        String[] abc = my_string.split("");
        String temp = abc[num1];
        abc[num1] = abc[num2];
        abc[num2] = temp;
        for(String a : abc) {
            sb.append(a);
        }
        return sb.toString();
        
    }
}