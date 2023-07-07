import java.util.stream.IntStream;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        return  IntStream.range(0, my_strings.length)
                .mapToObj(i -> {
                    int start = parts[i][0];
                    int end = parts[i][1];
                    if (start >= 0 && start < my_strings[i].length() && end >= 0 && end < my_strings[i].length()) {
                        return my_strings[i].substring(start, end + 1);
                    }
                    return "";
                })
                .reduce("", String::concat);


    }
}