class Solution {
    public int[] solution(int[] num_list) {
        // 짝이 안맞는 경우 (length가 홀수인 경우)
        if(num_list.length % 2 != 0 ){
            int i = num_list.length / 2;
            int j = i;
            while(i>=1){
                j++;
                i--;
                int temp = 0;
                temp = num_list[i];
                num_list[i] = num_list[j];
                num_list[j] = temp;
            }
        }
        // 짝이 맞는 경우 (length가 짝수인 경우)
        else{
            int i = num_list.length / 2;
            int j = i-1;
            while(j>=0){
                int temp = 0;
                temp = num_list[i];
                num_list[i] = num_list[j];
                num_list[j] = temp;
                j--;
                i++;
            }
        }
        return num_list;
    }
}