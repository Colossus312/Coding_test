import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> topLst = new ArrayList<Integer>();

        for(int i=0; i<score.length; i++) {

            if(topLst.size() < k) {
                topLst.add(score[i]);
            }else {
                if(topLst.get(0) < score[i]) {
                    topLst.set(0, score[i]);
                }
            }
            Collections.sort(topLst);

            answer[i] = topLst.get(0);
        }

        return answer;
    }
}