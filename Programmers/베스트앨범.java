import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {

        Hashtable<String,Integer> hash = new Hashtable<>();

        for(int i = 0; i < genres.length; i++){
            hash.put(genres[i], hash.getOrDefault(genres[i], 0) + plays[i]);
        }

        //몰라서 솔루션 참조 https://moonsbeen.tistory.com/158

        //key값만 가져와서 genre에 넣어준다
        ArrayList<String> genre = new ArrayList<>();
        for(String key : hash.keySet()) {
            genre.add(key);
        }
        Collections.sort(genre, (o1, o2) -> hash.get(o2) - hash.get(o1)); //key값에 해당하는 value를 내림차순으로 정렬한다.

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < genre.size(); i++) {
            String g = genre.get(i);

            //해당 장르의 음악 중에서 play횟수가 가장 큰 인덱스를 찾는다
            int max = 0;
            int firstIdx = -1;
            for(int j = 0; j < genres.length; j++) {
                if(g.equals(genres[j]) && max < plays[j]) {
                    max = plays[j];
                    firstIdx = j;
                }
            }

            //해당 장르의 음악 중에서 play횟수가 두번째로 큰 인덱스를 찾는다.
            max = 0;
            int secondIdx = -1;
            for(int j = 0; j < genres.length; j++) {
                if(g.equals(genres[j]) && max < plays[j] && j != firstIdx) {
                    max = plays[j];
                    secondIdx = j;
                }
            }

            list.add(firstIdx);
            if(secondIdx >= 0) list.add(secondIdx); //secondIdx는 존재 할수도, 안할수도 있다.
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}