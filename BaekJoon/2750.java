import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            numbers.add(reader.readLine());
        }

        Collections.sort(numbers, new Comparator<String>() {
            public int compare(String s1, String s2) {
                try {
                    int num1 = Integer.parseInt(s1);
                    int num2 = Integer.parseInt(s2);
                    return Integer.compare(num1, num2);
                } catch (NumberFormatException e) {
                    if (s1.matches("\\d+") && s2.matches("\\D+")) {
                        return -1;
                    } else if (s1.matches("\\D+") && s2.matches("\\d+")) {
                        return 1;
                    }
                    return s1.compareToIgnoreCase(s2);
                }
            }
        });

        for (String num : numbers) {
            System.out.println(num);
        }
    }
}