import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minQ = new PriorityQueue<>();

        for(String ope : operations){
            String[] opeArr = ope.split(" ");
            if(opeArr[0].equals("I")){
                maxQ.add(Integer.parseInt(opeArr[1]));
                minQ.add(Integer.parseInt(opeArr[1]));
            }else{
                if (!maxQ.isEmpty() || !minQ.isEmpty()) {
                    if(Character.toString(opeArr[1].charAt(0)).equals("-")){
                        int min = minQ.peek();
                        maxQ.remove(min);
                        minQ.remove(min);
                    }else{
                        int max = maxQ.peek();
                        maxQ.remove(max);
                        minQ.remove(max);
                    }
                }else{

                }
            }
        }
        if (!maxQ.isEmpty() || !minQ.isEmpty()) {
            answer[0] = maxQ.peek();
            answer[1] = minQ.peek();
        }else{

        }

        return answer;
    }
}