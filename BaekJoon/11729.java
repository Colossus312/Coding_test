import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void solve(int n, int from, int to, int aux, PrintWriter out) {
        if (n == 1) {
            out.println(from + " " + to);
            return;
        }
        solve(n - 1, from, aux, to, out);
        out.println(from + " " + to);
        solve(n - 1, aux, to, from, out);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        int k = (int) Math.pow(2, n) - 1;
        out.println(k);

        solve(n, 1, 3, 2, out);

        out.flush();
    }
}