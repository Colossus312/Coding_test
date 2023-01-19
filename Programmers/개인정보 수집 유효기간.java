import java.util.*;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<Integer>();

        Hashtable<String, Integer> hash = new Hashtable<>();

        String[] parseToday = today.split("\\.");
        int[] intToday = new int[3];

        for(String t : terms){
            String[] temp = t.split("\\s+");
            hash.put(temp[0],Integer.parseInt(temp[1]));
        }

        for(int i = 0; i < parseToday.length; i++){
            intToday[i] = Integer.parseInt(parseToday[i]);
        }

        int todayDate = (intToday[0]*12*28) + (intToday[1]*28) + intToday[2];
        for(int i=0;i<privacies.length;i++){
            int year = Integer.parseInt(privacies[i].substring(0, 4));
            int month = Integer.parseInt(privacies[i].substring(5, 7));
            int day = Integer.parseInt(privacies[i].substring(8,10));
            String abc = privacies[i].substring(11, 12);

            Integer term = hash.get(abc);
            month+= term;

            int temp = year*12*28+month*28+day-1;

            if(todayDate > temp){
                answer.add(i+1)  ;
            }
        }

        return answer;
    }
}