import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String X, String Y) {
        Map<Character, Integer> countX = new HashMap<>();
        Map<Character, Integer> countY = new HashMap<>();

        for (char ch : X.toCharArray()) {
            countX.put(ch, countX.getOrDefault(ch, 0) + 1);
        }
        for (char ch : Y.toCharArray()) {
            countY.put(ch, countY.getOrDefault(ch, 0) + 1);
        }

        StringBuilder partner = new StringBuilder();

        for (char digit = '9'; digit >= '0'; digit--) {
            if (countX.containsKey(digit) && countY.containsKey(digit)) {
                int commonCount = Math.min(countX.get(digit), countY.get(digit));
                for (int i = 0; i < commonCount; i++) {
                    partner.append(digit);
                }
            }
        }

        String result = partner.toString();
        if (result.isEmpty()) {
            return "-1";
        }
        if (result.matches("0+")) {
            return "0";
        }

        return result;
    }
}