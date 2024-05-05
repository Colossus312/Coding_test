import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> lis = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (lis.isEmpty() || lis.get(lis.size() - 1) < A[i]) {
                lis.add(A[i]);
            } else {
                int index = Collections.binarySearch(lis, A[i]);
                if (index < 0) {
                    index = -(index + 1);
                }
                lis.set(index, A[i]);
            }
        }

        System.out.println(lis.size());
    }
}