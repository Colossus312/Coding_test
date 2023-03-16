class Solution {
    public int maximumWealth(int[][] accounts) {
        int answer = 0;

        for(int[] a : accounts){
            int num = 0;
            for(int b: a){
                num += b;
            }
            if(answer < num){
                answer = num;
            }
        }
        return answer;
    }
}