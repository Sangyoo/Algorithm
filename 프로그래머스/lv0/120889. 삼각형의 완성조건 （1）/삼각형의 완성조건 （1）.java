class Solution {
    public int solution(int[] sides) {
        boolean a = sides[0] < sides[1] + sides[2];
        boolean b = sides[1] < sides[2] + sides[0];
        boolean c = sides[2] < sides[0] + sides[1];
        
        if(a && b && c) return 1;
        else return 2;
    }
}