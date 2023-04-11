class Solution {
    public String truncateSentence(String s, int k) {
        String answer = "";
        String[] sArr = s.split(" ");
        for(int i = 0; i < k; i++){
            answer = answer + sArr[i] + " ";
        }
        return answer.substring(0, answer.length() - 1);
    }
}