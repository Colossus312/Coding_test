import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String[] inputSizes = br.readLine().split(" ");
        int sizeA = Integer.parseInt(inputSizes[0]);
        int sizeB = Integer.parseInt(inputSizes[1]);

        Set<Integer> symmetricDiff = new HashSet<>();
        String[] elementsA = br.readLine().split(" ");
        for (int i = 0; i < sizeA; i++) {
            int element = Integer.parseInt(elementsA[i]);
            symmetricDiff.add(element);
        }

        String[] elementsB = br.readLine().split(" ");
        for (int i = 0; i < sizeB; i++) {
            int element = Integer.parseInt(elementsB[i]);
            if (!symmetricDiff.add(element)) {
                symmetricDiff.remove(element);
            }
        }

        out.println(symmetricDiff.size());
        out.flush();
    }
}