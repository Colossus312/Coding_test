import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {

        Map<String, Integer> playerIndices = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndices.put(players[i], i);
        }

        for (String calling : callings) {
            int index = playerIndices.get(calling);

            if (index > 0) {
                String temp = players[index];
                players[index] = players[index - 1];
                players[index - 1] = temp;

                playerIndices.put(players[index], index);
                playerIndices.put(players[index - 1], index - 1);
            }
        }

        return players;
    }
}