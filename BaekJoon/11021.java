import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());
        for(int i = 0; i < limit; i++){
            StringTokenizer B = new StringTokenizer(br.readLine()," ");
            System.out.println("Case #"+ (i+1) + ": " +(Integer.parseInt(B.nextToken()) + Integer.parseInt(B.nextToken())));

        }
        br.close();

    }

}