import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int result = 0;
        for(int i = 1; i < 10; i++) {
            int A = Integer.parseInt(br.readLine());
            if (A > max) {
                max = A;
                result = i;
            }
        }

        br.close();
        System.out.println(max);
        System.out.println(result);
    }

}