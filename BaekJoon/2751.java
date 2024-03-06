import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int N = Integer.parseInt(br.readLine());
        Integer[] numbers = new Integer[N];

        for (int i = 0; i < N; i++) {
            try {
                numbers[i] = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
            }
        }

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i < N; i++) {
            if (numbers[i] != null) {
                pw.println(numbers[i]);
            }
        }

        pw.flush();
        pw.close();
        br.close();
    }
}