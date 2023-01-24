import java.util.stream.Stream;
class Solution {
    public int[] solution(long n) {

        String number = String.valueOf(n);
        StringBuffer sb = new StringBuffer(number);
        String[] reversedNumber = sb.reverse().toString().split("");
        int[] answer = Stream.of(reversedNumber).mapToInt(Integer::parseInt).toArray();

        return answer;
    }
}