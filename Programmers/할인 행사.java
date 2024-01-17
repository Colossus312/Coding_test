import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int result = 0;
        Map<String, Integer> wantMap = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> tempMap = new HashMap<>();

            for (int j = i; j < i + 10; j++) {
                tempMap.put(discount[j], tempMap.getOrDefault(discount[j], 0) + 1);
            }

            boolean isValidDay = true;
            for (String item : wantMap.keySet()) {
                if (!tempMap.containsKey(item) || tempMap.get(item) < wantMap.get(item)) {
                    isValidDay = false;
                    break;
                }
            }

            if (isValidDay) {
                result++;
            }
        }

        return result;
    }
}