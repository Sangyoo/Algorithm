import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> strList = new ArrayList<>();
        int lastIndex = 0;
        for(int m = n; m<=my_str.length(); m+=n){
            strList.add(my_str.substring(lastIndex, m));
            lastIndex = m;
        }
        if(lastIndex != my_str.length()) {
            strList.add(my_str.substring(lastIndex, my_str.length()));
        }
        return strList.toArray(new String[strList.size()]);
    }
}