class Solution {
    public int solution(int n) {
        return (n * 6) / gcd(n, 6) / 6;
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}