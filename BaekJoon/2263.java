import java.io.*;
import java.util.*;

public class Main {
    static int[] inOrder;
    static int[] postOrder;
    static int[] indexMap;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        inOrder = new int[n];
        postOrder = new int[n];
        indexMap = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            inOrder[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            postOrder[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            indexMap[inOrder[i]] = i;
        }

        getPreOrder(0, n - 1, 0, n - 1);
        System.out.println(sb.toString());
    }

    static void getPreOrder(int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) return;

        int root = postOrder[postEnd];
        sb.append(root).append(" ");

        int rootIndex = indexMap[root];
        int leftSize = rootIndex - inStart;

        getPreOrder(inStart, rootIndex - 1, postStart, postStart + leftSize - 1);
        getPreOrder(rootIndex + 1, inEnd, postStart + leftSize, postEnd - 1);
    }
}
