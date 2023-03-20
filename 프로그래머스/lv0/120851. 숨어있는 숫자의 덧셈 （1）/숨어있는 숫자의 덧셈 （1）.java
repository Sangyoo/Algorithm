class Solution {
    public int solution(String my_string) {
        int result = 0;
        char[] abc = my_string.toCharArray();
        for(char a : abc) {
            if(a >= '0' && a<= '9') {
                result = result + (a-'0');
            }
        }
        return result;
    }
}