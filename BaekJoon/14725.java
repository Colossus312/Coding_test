import java.util.*;

public class Main {
    static class Node {
        String name;
        Map<String, Node> children;

        public Node(String name) {
            this.name = name;
            this.children = new TreeMap<>();
        }

        void addChild(String childName) {
            children.putIfAbsent(childName, new Node(childName));
        }

        Node getChild(String childName) {
            return children.get(childName);
        }

        void printTree(String prefix) {
            System.out.println(prefix + name);
            for (Node child : children.values()) {
                child.printTree(prefix + "--");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        Node root = new Node("ROOT");
        while (N-- > 0) {
            String[] parts = scanner.nextLine().trim().split(" ");
            Node current = root;

            for (int i = 1; i < parts.length; i++) {
                current.addChild(parts[i]);
                current = current.getChild(parts[i]);
            }
        }

        for (Node node : root.children.values()) {
            node.printTree("");
        }

        scanner.close();
    }
}