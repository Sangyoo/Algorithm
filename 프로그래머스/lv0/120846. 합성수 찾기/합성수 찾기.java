import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1,n).filter(c->isCompound(c)).count();
    }
    private static boolean isCompound(int a) {
        for(int i=2; i < a; i++){
            if(a%i == 0) return true;
        }
        return false;
    }
}