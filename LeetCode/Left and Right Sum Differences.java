class Solution {
    public int[] leftRigthDifference(int[] nums) {

        int[] answer = new int[nums.length];
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int num = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0){
                num += nums[i - 1];
            }
            leftSum[i] = num;
        }
        num = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + 1 < nums.length){
                num += nums[i + 1];
            }
            rightSum[i] = num;
        }

        for (int i = 0; i < nums.length; i++){
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }
}