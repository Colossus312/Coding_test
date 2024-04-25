import java.util.Scanner;

public class Main {

    public static int timeToDial(String word) {
        int totalTime = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int number = getNumber(c);
            totalTime += (number - 1) + 2;
        }

        return totalTime;
    }

    private static int getNumber(char letter) {
        if (letter >= 'A' && letter <= 'C') return 2;
        if (letter >= 'D' && letter <= 'F') return 3;
        if (letter >= 'G' && letter <= 'I') return 4;
        if (letter >= 'J' && letter <= 'L') return 5;
        if (letter >= 'M' && letter <= 'O') return 6;
        if (letter >= 'P' && letter <= 'S') return 7;
        if (letter >= 'T' && letter <= 'V') return 8;
        if (letter >= 'W' && letter <= 'Z') return 9;

        throw new IllegalArgumentException("Invalid letter: " + letter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(timeToDial(word));
        scanner.close();
    }
}