import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        HashMap<String, Integer> nameToNumber = new HashMap<>();
        String[] numberToName = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            String pokemonName = br.readLine();
            nameToNumber.put(pokemonName, i);
            numberToName[i] = pokemonName;
        }

        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            if (Character.isDigit(query.charAt(0))) {
                int number = Integer.parseInt(query);
                System.out.println(numberToName[number]);
            } else {
                System.out.println(nameToNumber.get(query));
            }
        }
    }
}