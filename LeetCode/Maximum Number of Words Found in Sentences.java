class Solution {
    public int mostWordsFound(String[] sentences) {
        int answer = 0;
        for(String a : sentences){
            int num = a.split(" ").length;
            if(answer < num){
                answer = num;
            }
        }
        return answer;
    }
}