import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int groupWordCount = 0;

        for (int i = 0; i < N; i++) {
            String word = reader.readLine();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }

        System.out.println(groupWordCount);
    }

    private static boolean isGroupWord(String word) {
        Set<Character> seenCharacters = new HashSet<>();
        char lastChar = '\0';

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar != lastChar) {
                if (seenCharacters.contains(currentChar)) {
                    return false;
                }
                seenCharacters.add(currentChar);
                lastChar = currentChar;
            }
        }
        return true;
    }
}