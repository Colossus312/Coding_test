import java.util.stream.IntStream;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        return IntStream.range(0, rank.length).boxed().sorted((i, j) -> rank[i] - rank[j]).filter(i -> attendance[i]).limit(3).mapToInt(i -> i).reduce((a, b) -> a * 100 + b).getAsInt();
    }
}