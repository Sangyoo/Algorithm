class Solution {
    public int solution(String s) {
        int result = 0;
        String[] str = s.split(" ");
        for(int i = 0; i< str.length; i++) {
            if(str[i].equals("Z")) result = result - Integer.valueOf(str[i-1]);
            else result = result + Integer.valueOf(str[i]);
        }
        return result;
    }
}