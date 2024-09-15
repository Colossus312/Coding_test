import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Node {
    char data;
    Node left, right;
    Node(char data) {
        this.data = data;
    }
}

public class Main {
    static Map<Character, Node> nodeMap = new HashMap<>();

    static void preorder(Node node, StringBuilder sb) {
        if (node == null) return;
        sb.append(node.data);
        preorder(node.left, sb);
        preorder(node.right, sb);
    }

    static void inorder(Node node, StringBuilder sb) {
        if (node == null) return;
        inorder(node.left, sb);
        sb.append(node.data);
        inorder(node.right, sb);
    }

    static void postorder(Node node, StringBuilder sb) {
        if (node == null) return;
        postorder(node.left, sb);
        postorder(node.right, sb);
        sb.append(node.data);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            char data = input.charAt(0);
            char leftData = input.charAt(2);
            char rightData = input.charAt(4);

            Node node = nodeMap.getOrDefault(data, new Node(data));
            nodeMap.put(data, node);

            if (leftData != '.') {
                Node leftNode = nodeMap.getOrDefault(leftData, new Node(leftData));
                nodeMap.put(leftData, leftNode);
                node.left = leftNode;
            }

            if (rightData != '.') {
                Node rightNode = nodeMap.getOrDefault(rightData, new Node(rightData));
                nodeMap.put(rightData, rightNode);
                node.right = rightNode;
            }
        }

        Node root = nodeMap.get('A');

        StringBuilder preorderResult = new StringBuilder();
        StringBuilder inorderResult = new StringBuilder();
        StringBuilder postorderResult = new StringBuilder();

        preorder(root, preorderResult);
        inorder(root, inorderResult);
        postorder(root, postorderResult);

        System.out.println(preorderResult);
        System.out.println(inorderResult);
        System.out.println(postorderResult);

        scanner.close();
    }
}
