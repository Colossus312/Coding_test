class Solution {
    public int countDigits(int num) {
        int answer = 0;
        String[] numArr = Integer.toString(num).split("");
        for(String a : numArr){
            if(num%Integer.parseInt(a) == 0){
                answer++;
            }
        }
        return answer;
    }
}