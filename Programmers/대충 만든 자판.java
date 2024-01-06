import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> minKeyPressesPerChar = new HashMap<>();

        for (String keys : keymap) {
            for (int i = 0; i < keys.length(); i++) {
                char ch = keys.charAt(i);
                minKeyPressesPerChar.put(ch, Math.min(minKeyPressesPerChar.getOrDefault(ch, i + 1), i + 1));
            }
        }

        int[] totalKeyPressesForTargets = new int[targets.length];
        for (int t = 0; t < targets.length; t++) {
            String target = targets[t];
            int totalKeyPresses = 0;
            boolean canType = true;
            for (char ch : target.toCharArray()) {
                if (!minKeyPressesPerChar.containsKey(ch)) {
                    canType = false;
                    break;
                } else {
                    totalKeyPresses += minKeyPressesPerChar.get(ch);
                }
            }
            totalKeyPressesForTargets[t] = canType ? totalKeyPresses : -1;
        }

        return totalKeyPressesForTargets;
    }
}