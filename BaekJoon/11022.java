import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());
        for(int i = 0; i < limit; i++){
            StringTokenizer A = new StringTokenizer(br.readLine()," ");
            int B = Integer.parseInt(A.nextToken());
            int C = Integer.parseInt(A.nextToken());
            System.out.println("Case #"+ (i+1) + ": " + B + " + " + C + " = " + (B+C));
        }
        br.close();

    }

}