import java.util.*;

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEndOfWord = false;
    int childCount = 0;
}

class Trie {
    TrieNode root = new TrieNode();

    void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (!node.children.containsKey(c)) {
                node.children.put(c, new TrieNode());
                node.childCount++;
            }
            node = node.children.get(c);
        }
        node.isEndOfWord = true;
    }

    int countPresses(String word) {
        TrieNode node = root;
        int presses = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.childCount > 1 || node.isEndOfWord || i == 0) {
                presses++;
            }
            node = node.children.get(c);
        }
        return presses;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int N = scanner.nextInt();
            if (N == 0) {
                break;
            }

            Trie trie = new Trie();
            String[] words = new String[N];
            for (int i = 0; i < N; i++) {
                words[i] = scanner.next();
                trie.insert(words[i]);
            }

            int totalPresses = 0;
            for (String word : words) {
                totalPresses += trie.countPresses(word);
            }

            double averagePresses = (double) totalPresses / N;
            System.out.printf("%.2f%n", averagePresses);
        }

        scanner.close();
    }
}