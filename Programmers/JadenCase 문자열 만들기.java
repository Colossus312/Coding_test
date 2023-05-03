class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean flag = true;
        for(String a : s.split("")){
            if(flag){
                answer.append(a.toUpperCase());
                flag = false;
            }else{
                answer.append(a.toLowerCase());
                flag = false;
            }
            if(" ".equals(a)){
                flag = true;
            }
        }
        return answer.toString();
    }
}