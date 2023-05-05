class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(!s.equals("1")){
            int sNum1 = s.length();
            s = s.replaceAll("0" , "");
            int sNum2 = s.length();
            answer[1] += sNum1 - sNum2;
            s = Integer.toString(s.length(),2);
            answer[0]++;
        }

        return answer;
    }
}