import java.util.Hashtable;
class Solution {
    public int[] solution(String s) {
        Hashtable<Character,Integer> hash = new Hashtable<>();
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++){

            if(hash.get(s.charAt(i)) != null){
                answer[i] = i - hash.get(s.charAt(i));
                hash.put(s.charAt(i),i);
            }else{
                hash.put(s.charAt(i),i);
                answer[i] = -1;
            }

        }
        return answer;
    }
}