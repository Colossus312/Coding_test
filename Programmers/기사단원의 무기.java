class Solution {
    public int solution(int number, int limit, int power) {
        int[] divisorsCount = precalculateDivisors(number);
        int totalWeight = 0;
        for (int i = 1; i <= number; i++) {
            if (divisorsCount[i] > limit) {
                totalWeight += power;
            } else {
                totalWeight += divisorsCount[i];
            }
        }
        return totalWeight;
    }
    private static int[] precalculateDivisors(int number) {
        int[] divisorsCount = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisorsCount[j]++;
            }
        }
        return divisorsCount;
    }
}