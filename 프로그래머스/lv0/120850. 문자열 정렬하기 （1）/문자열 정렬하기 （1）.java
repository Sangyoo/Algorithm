import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> numList = new ArrayList<Integer>();
        String[] abc = my_string.split("");
        for(String a : abc){
            if(isNumeric(a)){
                numList.add(Integer.parseInt(a));
            }
        }
        numList.sort(Comparator.naturalOrder());
        int[] numArray = numList.stream().mapToInt(i->i).toArray();
        return numArray;
    }
    public static boolean isNumeric(String content){
        return content != null && content.matches("[0-9]");
    }
}