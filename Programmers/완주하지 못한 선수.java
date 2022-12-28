import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> hash = new HashMap<>();

        for(String data : participant){
            hash.put(data, hash.getOrDefault(data, 0) + 1); //값이없으면 0
        }
        for(String data : completion){
            hash.put(data, hash.get(data) -1);
        }
        Set<String> keySet = hash.keySet();
        for (String key : keySet) {
            if(hash.get(key) != 0){
                answer = key;
            }
        }


        return answer;
    }
}