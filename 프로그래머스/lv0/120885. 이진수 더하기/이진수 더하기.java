import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
        int sumOfDec = getDecimal(bin1) + getDecimal(bin2);
        return getBinary(sumOfDec);
    }
    public static int getDecimal(String str){
        int i = 1;
        int sup = 0;
        int sum = 0;
        String[] binarr = str.split("");
        int j = binarr.length;
        for(int z=j-1;z>=0;z--){
            sup = Integer.valueOf(binarr[z]) * i;
            sum += sup;
            i*=2;
        }
        return sum;
    }
    public static String getBinary(int num){
        StringBuilder sb = new StringBuilder();
        while(num>1){
            sb.append(String.valueOf(num%2));
            num = num/2;
        }
        if(num == 1) sb.append("1");
        else if(num ==0) sb.append("0");
        return sb.reverse().toString();
    }
}