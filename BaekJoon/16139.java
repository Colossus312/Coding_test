import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int[][] preprocessString(String S) {
        int n = S.length();
        int[][] prefix = new int[26][n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 26; j++) {
                prefix[j][i + 1] = prefix[j][i];
            }
            prefix[S.charAt(i) - 'a'][i + 1]++;
        }

        return prefix;
    }

    public static void answerQueries(String S, int q, String[] queries) {
        int[][] prefix = preprocessString(S);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(queries[i]);
            char alpha = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            int charIndex = alpha - 'a';
            int count = prefix[charIndex][r + 1] - prefix[charIndex][l];
            result.append(count).append("\n");
        }

        System.out.print(result.toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String S = reader.readLine();
        int q = Integer.parseInt(reader.readLine());

        String[] queries = new String[q];
        for (int i = 0; i < q; i++) {
            queries[i] = reader.readLine();
        }

        answerQueries(S, q, queries);
    }
}
