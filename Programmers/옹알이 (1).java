import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        Pattern p = Pattern.compile("aya|ye|woo|ma");

        for (String word : babbling) {
            Matcher m = p.matcher(word);
            int matchCount = 0;

            while (m.find()) {
                matchCount++;
            }

            String replaced = word.replaceAll("aya|ye|woo|ma", "");
            if (replaced.isEmpty() && matchCount <= 4) {
                count++;
            }
        }
        return count;
    }
}