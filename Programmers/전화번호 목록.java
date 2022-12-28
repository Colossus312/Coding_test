import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {

        //해시문제라서 해시로 풀긴 했는데 startsWith을 썻으면 더 효율적일것

        boolean answer = true;
        Hashtable<String,Integer> hash = new Hashtable<>();

        for(int i = 0; i < phone_book.length; i++){
            hash.put(phone_book[i],i);
        }

        for(int i = 0; i < phone_book.length; i++){
            for (int j = 0; j < phone_book[i].length(); j++){
                if (hash.containsKey(phone_book[i].substring(0, j)))
                    return false;
            }

        }




        return answer;
    }
}