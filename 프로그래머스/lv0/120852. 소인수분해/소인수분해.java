import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> one = new ArrayList<>();
        List<Integer> factors = getPrimeNums(one, n);
        if(isPrimeNum(n)) {
            factors.add(n);
        }
        Collections.sort(factors);
        int[] answer = factors.stream().mapToInt(Integer::intValue).toArray();
        return answer;
            
    }
    public static boolean isPrimeNum(int a){
        for(int i = 2 ; i<a; i++){
            if(a%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static List<Integer> getPrimeNums(List<Integer> one, int b){
                
        // 1 ~ n의 제곱근까지(i라고 지정) 나누어떨어지는지 확인
        for(int i = 2 ; i< b; i++){      
            // 나누어 떨어지면
            if(b%i == 0) {
                // i가 소수이고, one에 들어와있지 않다면
                if(isPrimeNum(i) && !one.contains(i)){
                    one.add(i);
                }
                // 나누어 떨어지지만 소수가 아니라면 i를 재귀에 넣음
                else{
                    getPrimeNums(one, i);
                }
            }
        }
        return one;
    }
}