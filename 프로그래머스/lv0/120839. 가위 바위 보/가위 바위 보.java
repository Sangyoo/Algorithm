import java.util.*;

class Solution {
    public String solution(String rsp) {
        Map<String, String> mp = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        mp.put("0", "5");
        mp.put("2", "0");
        mp.put("5", "2");
        String[] abc = rsp.split("");
        for(String a : abc) {
            sb.append(mp.get(a));
        }
        return sb.toString();
    }
}