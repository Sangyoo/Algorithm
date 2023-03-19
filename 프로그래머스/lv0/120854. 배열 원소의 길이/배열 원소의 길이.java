import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(String[] strlist) {
        int[] abc = new int[strlist.length];
        for(int i = 0; i< strlist.length; i++){
            abc[i] = strlist[i].length();
        }
        return abc;
    }
}