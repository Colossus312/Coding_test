import java.io.*;
import java.util.*;

public class Main {
    private static int[] array;
    private static int[] tmp;
    private static int K;
    private static int counter;
    private static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        array = new int[N];
        tmp = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        counter = 0;
        mergeSort(0, N - 1);

        System.out.println(result);
    }

    private static void mergeSort(int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(p, q);
            mergeSort(q + 1, r);
            merge(p, q, r);
        }
    }

    private static void merge(int p, int q, int r) {
        int i = p, j = q + 1, t = 0;

        while (i <= q && j <= r) {
            if (array[i] <= array[j]) {
                tmp[t++] = array[i++];
            } else {
                tmp[t++] = array[j++];
            }
        }
        while (i <= q) {
            tmp[t++] = array[i++];
        }
        while (j <= r) {
            tmp[t++] = array[j++];
        }

        i = p;
        t = 0;
        while (i <= r) {
            array[i++] = tmp[t++];
            counter++;
            if (counter == K) {
                result = array[i - 1];
                return;
            }
        }
    }
}