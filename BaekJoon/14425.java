import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine = br.readLine().split(" ");
        int N = Integer.parseInt(inputLine[0]);
        int M = Integer.parseInt(inputLine[1]);

        HashSet<String> setS = new HashSet<>();

        for (int i = 0; i < N; i++) {
            setS.add(br.readLine());
        }

        int count = 0; // To count how many of M strings are in set S

        for (int i = 0; i < M; i++) {
            if (setS.contains(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}