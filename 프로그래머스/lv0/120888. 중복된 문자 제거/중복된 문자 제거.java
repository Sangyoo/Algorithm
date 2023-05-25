import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] abc = my_string.split("");
        List<String> st = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< abc.length; i++){
            if(!st.contains(abc[i])) {
                sb.append(abc[i]);
                st.add(abc[i]);
            }
        }
        return sb.toString();
    }
}