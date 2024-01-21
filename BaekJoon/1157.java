import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        int maxFreq = 0;
        char mostFrequentChar = '?';

        for (char ch : word.toCharArray()) {
            char upperCaseChar = Character.toUpperCase(ch);
            frequencyMap.put(upperCaseChar, frequencyMap.getOrDefault(upperCaseChar, 0) + 1);

            if (frequencyMap.get(upperCaseChar) > maxFreq) {
                maxFreq = frequencyMap.get(upperCaseChar);
                mostFrequentChar = upperCaseChar;
            }
        }

        int countMaxFreq = 0;
        for (char ch : frequencyMap.keySet()) {
            if (frequencyMap.get(ch) == maxFreq) {
                countMaxFreq++;
                if (countMaxFreq > 1) {
                    mostFrequentChar = '?';
                    break;
                }
            }
        }

        System.out.println(mostFrequentChar);
    }
}