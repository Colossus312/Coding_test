import java.util.ArrayList;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : ingredient) {

            list.add(num);

            if (list.size() >= 4) {

                int size = list.size();

                if (list.get(size - 4) == 1 && list.get(size - 3) == 2 &&
                        list.get(size - 2) == 3 && list.get(size - 1) == 1) {

                    answer++;

                    for (int i = 0; i < 4; i++) {

                        list.remove(list.size() - 1);

                    }
                }
            }
        }
        return answer;
    }
}