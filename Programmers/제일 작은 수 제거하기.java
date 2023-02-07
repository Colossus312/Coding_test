import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        if(arr.length == 1){
            int answer[] = {-1};
            return answer;
        }

        int[] copy = arr.clone();
        Arrays.sort(copy);

        int[] answer = new int[arr.length-1];
        int idx = 0;
        for(int i : arr){
            if(i == copy[0]){

            }else{
                answer[idx] = i;
                idx++;
            }
        }

        return answer;
    }
}