class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] answer = new int[nums.length*2];
        for(int i = 0 ; i < 2 ; i++){
            int num = nums.length*i;
            for(int j = 0; j < nums.length ; j++){
                answer[num+j] = nums[j];
            }
        }
        return answer;
    }
}