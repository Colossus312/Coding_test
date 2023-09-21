import java.util.stream.IntStream;
import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        return BigInteger.ONE.multiply(IntStream.rangeClosed(Math.max(share, balls - share) + 1, balls).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply)).divide(IntStream.rangeClosed(2, Math.min(share, balls - share)).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply)).intValue();
    }
}