class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0], x = bandage[1], y = bandage[2];
        int currentHealth = health;
        int continuousSuccess = 0;
        int time = 0;
        int attackIndex = 0;

        while (attackIndex < attacks.length || continuousSuccess > 0) {
            if (attackIndex < attacks.length && attacks[attackIndex][0] == time) {
                currentHealth -= attacks[attackIndex][1];
                attackIndex++;
                continuousSuccess = 0;

                if (currentHealth <= 0) {
                    return -1;
                }
            } else {
                if (currentHealth < health) {
                    int healAmount = Math.min(x, health - currentHealth);
                    currentHealth += healAmount;
                }

                continuousSuccess++;

                if (continuousSuccess == t) {
                    currentHealth = Math.min(health, currentHealth + y);
                    continuousSuccess = 0;
                }
            }
            time++;
        }

        return currentHealth;
    }
}