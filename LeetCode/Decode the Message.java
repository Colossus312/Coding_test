import java.util.Hashtable;

class Solution {
    public String decodeMessage(String key, String message) {
        Hashtable<String,String> hash = new Hashtable<>();
        String[] keyArr = key.replaceAll(" ", "").split("");
        String[] keyVal = "abcdefghijklmnopqrstuvwxyz".split("");
        int valChk = 0;
        for(String a : keyArr){
            if(hash.containsKey(a)){

            }else{
                hash.put(a,keyVal[valChk]);
                valChk++;
            }
        }
        String[] messageArr = message.split("");
        String answer = "";
        for(String b : messageArr){
            if(b.equals(" ")){
                answer = answer + " ";
            }else{
                answer = answer + hash.get(b);
            }
        }

        return answer;
    }
}