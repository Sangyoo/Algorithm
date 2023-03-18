class Solution {
    public int solution(int[] numbers) {
        // 첫 번째 인덱스의 수를 제일 큰 수라고 지정
        int max1 = numbers[0];
        // 첫번째로 큰 수의 인덱스
        int changed = 0;
        // 순회하며
        for(int i = 0; i< numbers.length; i++) {
            // 큰 수를 찾는다
            if( max1 < numbers[i]) {
                // 큰 수를 max1에 할당한다
                max1 = numbers[i];
                // 바꿀 index를 계속 갱신한다
                changed = i;
            }
        }
    
        numbers[changed] = 0;
        
        // 두번쨰로 큰 수 구하기
        int max2 = numbers[0];
        for(int k = 0; k< numbers.length; k++) {
            if( max2 < numbers[k]) {
                max2 = numbers[k];
            }
        }
        return max1 * max2;
    }
}