import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();

        String[] croatianAlphabets = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String alphabet : croatianAlphabets) {
            if (word.contains(alphabet)) {
                word = word.replace(alphabet, "X");
            }
        }

        System.out.println(word.length());
    }
}