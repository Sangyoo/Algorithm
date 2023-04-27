import java.util.*;
class Solution {
    public String solution(int age) {
        String[] alp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        StringBuilder sb = new StringBuilder();
        String abc = Integer.toString(age);
        String[] abcs = abc.split("");
        int i = 0;
        for(String a: abcs) {
            for(i=0; i< num.length; i++){
                if(num[i].equals(a)) break;
            }
            sb.append(alp[i]);
        }
        return sb.toString();
    }
}