class Solution {
    public int balancedStringSplit(String s) {
        int stack = 0;
        int answer = 0;

        for(String a : s.split("")){
            if(a.equals("L")){
                stack += 1;
            }else{
                stack -= 1;
            }

            if(stack == 0) {
                answer++;
            }
        }
        return answer;
    }
}