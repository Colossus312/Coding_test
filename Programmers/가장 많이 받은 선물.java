import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> friendIndexMap = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            friendIndexMap.put(friends[i], i);
        }

        int[][] giftMatrix = new int[friends.length][friends.length];
        int[] giftsGivenCount = new int[friends.length];

        for (String transaction : gifts) {
            String[] parts = transaction.split(" ");
            String giver = parts[0];
            String receiver = parts[1];
            giftMatrix[friendIndexMap.get(giver)][friendIndexMap.get(receiver)]++;
        }

        int[] totalGiftsGiven = new int[friends.length];
        int[] totalGiftsReceived = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                totalGiftsGiven[i] += giftMatrix[i][j];
                totalGiftsReceived[j] += giftMatrix[i][j];
            }
        }

        int[] netGiftsGiven = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {
            netGiftsGiven[i] = totalGiftsGiven[i] - totalGiftsReceived[i];
        }

        for (int i = 0; i < friends.length; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                if (giftMatrix[i][j] > giftMatrix[j][i]) {
                    giftsGivenCount[i]++;
                } else if (giftMatrix[j][i] > giftMatrix[i][j]) {
                    giftsGivenCount[j]++;
                } else {
                    if (netGiftsGiven[i] > netGiftsGiven[j]) {
                        giftsGivenCount[i]++;
                    }
                    if (netGiftsGiven[j] > netGiftsGiven[i]) {
                        giftsGivenCount[j]++;
                    }
                }
            }
        }

        int maxGifts = 0;
        for (int count : giftsGivenCount) {
            maxGifts = Math.max(maxGifts, count);
        }

        return maxGifts;
    }
}