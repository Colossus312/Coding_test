import java.util.Arrays;

class Solution {
    public int solution(String[] order) {
        return Arrays.stream(order)
                .mapToInt(s -> {
                    if ("icecafelatte".equals(s) || "cafelatteice".equals(s) || "hotcafelatte".equals(s) || "cafelattehot".equals(s) || "cafelatte".equals(s)) return 5000;
                    else return 4500;
                })
                .sum();
    }
}