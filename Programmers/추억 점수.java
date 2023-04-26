import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        int[] answer = new int[photo.length];

        Hashtable<String, Integer> hash = new Hashtable<>();
        for(int i = 0; i < name.length; i++){
            hash.put(name[i],yearning[i]);
        }
        for(int j = 0; j < photo.length; j++){
            int sum = 0;
            for(int k = 0; k < photo[j].length; k++){
                if(hash.containsKey(photo[j][k])){
                    sum+=hash.get(photo[j][k]);
                }
            }
            answer[j] = sum;
        }

        return answer;
    }
}