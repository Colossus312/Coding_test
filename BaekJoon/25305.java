import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        Integer[] scores = new Integer[N];
        String[] scoreStrings = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(scoreStrings[i]);
        }

        Arrays.sort(scores, Collections.reverseOrder());

        int cutoffScore = scores[k - 1];

        System.out.println(cutoffScore);
    }
}