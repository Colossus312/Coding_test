import java.util.*;
import java.io.*;

public class Main {
    static class Node {
        int key;
        Node left, right;
        Node(int key) {
            this.key = key;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> preOrder = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null && line.length() > 0) {
            preOrder.add(Integer.parseInt(line));
        }

        Node root = constructBST(preOrder, Integer.MIN_VALUE, Integer.MAX_VALUE, new int[]{0});
        postOrderTraversal(root);
    }

    private static Node constructBST(List<Integer> preOrder, int min, int max, int[] index) {
        if (index[0] >= preOrder.size()) return null;

        int key = preOrder.get(index[0]);
        if (key < min || key > max) return null;

        Node root = new Node(key);
        index[0]++;
        root.left = constructBST(preOrder, min, key, index);
        root.right = constructBST(preOrder, key, max, index);
        return root;
    }

    private static void postOrderTraversal(Node node) {
        if (node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.key);
    }
}
