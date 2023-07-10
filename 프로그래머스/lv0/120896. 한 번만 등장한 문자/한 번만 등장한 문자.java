import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] abc = s.split("");
        Arrays.sort(abc);
        List<String> abcd = new ArrayList<>(Arrays.asList(abc));
        for(String a : abc) {
            if(abcd.remove(a)){
                if(abcd.remove(a)){
                    while(abcd.remove(a)){}
                }
                else sb.append(a);
            };
        }
        return sb.toString();
    }
}