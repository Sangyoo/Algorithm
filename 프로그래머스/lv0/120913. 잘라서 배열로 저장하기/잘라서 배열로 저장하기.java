import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        // 잘라서 저장할 배열
        List<String> strList = new ArrayList<>();
        
        // SubString 복사를 시작할 index
        int lastIndex = 0;
        
        // Substring 복사 시작
        for(int m = n; m<=my_str.length(); m+=n){
            strList.add(my_str.substring(lastIndex, m));
            lastIndex = m;
        }
        
        // 마지막 String 덩어리가 n보다 작아서 복사되지 않은 경우
        if(lastIndex != my_str.length()) {
            strList.add(my_str.substring(lastIndex, my_str.length()));
        }
        
        // 배열로 변환 후 return
        return strList.toArray(new String[strList.size()]);
    }
}