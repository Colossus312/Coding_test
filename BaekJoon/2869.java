import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        // if(B >= A || A > V || V > 1000000000) {
        //    return;
        // }

        int days = (int) Math.ceil((double) (V - A) / (A - B)) + 1;

        System.out.println(days);
    }
}