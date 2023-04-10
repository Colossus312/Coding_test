class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int answer = 0;

        for(int i = 1 ; i <= arr.length; i+= 2){
            for (int j = 0 ; j < arr.length - i + 1 ; j++){
                for (int k = j ; k < j + i ; k++){
                    answer += arr[k];
                }
            }
        }

        return answer;
    }
}