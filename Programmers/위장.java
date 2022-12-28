import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        Hashtable<String,Integer> hash = new Hashtable<>();

        for(String[] data : clothes){
            hash.put(data[1], hash.getOrDefault(data[1], 0) + 1);
        }
        if(hash.size() == 1){ //의상 종류가 하나일경우
            return clothes.length;
        }else{
            Enumeration<String> enumKey = hash.keys();
            int add = 1;
            while(enumKey.hasMoreElements()){
                String key = enumKey.nextElement();
                int value = hash.get(key);
                add = (value+1) * add; //각 경우의수 +1 (안입음)을 곱해준다
            }
            answer = add - 1; //전부 안입는 경우의 수 1을 뺌
        }


        return answer;
    }
}