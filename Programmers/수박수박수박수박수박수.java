class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        boolean flag = true;
        for(int i = 0 ; n > i; i++){
            if(flag){
                answer.append("수");
                flag = false;
            }else{
                answer.append("박");
                flag = true;
            }
        }

        return answer.toString();
    }
}