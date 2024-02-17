import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = br.readLine();
        }

        StringBuilder result = new StringBuilder();
        boolean lettersAvailable = true;
        int position = 0;

        while (lettersAvailable) {
            lettersAvailable = false;

            for (String word : words) {
                if (position < word.length()) {
                    result.append(word.charAt(position));
                    lettersAvailable = true;
                }
            }

            position++;
        }

        System.out.println(result.toString());
    }
}