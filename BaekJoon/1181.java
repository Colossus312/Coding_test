import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        Set<String> words = new TreeSet<>(new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int lengthCompare = Integer.compare(o1.length(), o2.length());
                if (lengthCompare != 0) {
                    return lengthCompare;
                }
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i < N; i++) {
            words.add(scanner.nextLine());
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}