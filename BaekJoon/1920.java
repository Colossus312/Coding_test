import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine().trim());

        String[] elements = reader.readLine().trim().split(" ");
        HashSet<Integer> set = new HashSet<>();
        for (String element : elements) {
            set.add(Integer.parseInt(element));
        }

        int M = Integer.parseInt(reader.readLine().trim());

        String[] queries = reader.readLine().trim().split(" ");

        StringBuilder output = new StringBuilder();
        for (String query : queries) {
            int queryNum = Integer.parseInt(query);
            if (set.contains(queryNum)) {
                output.append("1\n");
            } else {
                output.append("0\n");
            }
        }

        System.out.print(output.toString());
    }
}