import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buf = "";
        while ((buf = br.readLine()) != null) {
            StringTokenizer A = new StringTokenizer(buf," ");
            int B = Integer.parseInt(A.nextToken());
            int C = Integer.parseInt(A.nextToken());

            System.out.println(B+C);


        }

        br.close();

    }

}