import java.util.Scanner;

public class Main {

    public static Long[] seq = new Long[101];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        seq[0] = 0L;
        seq[1] = 1L;
        seq[2] = 1L;
        seq[3] = 1L;

        int T = in.nextInt();

        while(T-- > 0) {
            int N = in.nextInt();
            System.out.println(padovan(N));
        }

        in.close();
    }

    public static long padovan(int N) {
        if (seq[N] == null) {
            seq[N] = padovan(N - 2) + padovan(N - 3);
        }
        return seq[N];
    }
}