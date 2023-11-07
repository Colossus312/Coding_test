import java.util.stream.IntStream;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        return IntStream.of((numer1 * denom2) + (numer2 * denom1), denom1 * denom2)
                .map(i -> i / gcd((numer1 * denom2) + (numer2 * denom1), denom1 * denom2)).toArray();
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}