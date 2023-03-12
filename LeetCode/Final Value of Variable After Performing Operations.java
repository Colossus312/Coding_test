class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int answer = 0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].charAt(1)=='+'){
                answer+=1;
            }else{
                answer-=1;
            }
        }
        return answer;
    }
}