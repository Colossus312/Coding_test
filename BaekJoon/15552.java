import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer A = new StringTokenizer(br.readLine());
        int limit = Integer.parseInt(A.nextToken());
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < limit; i++){
            StringTokenizer B = new StringTokenizer(br.readLine()," ");
            res.append(Integer.parseInt(B.nextToken()) + Integer.parseInt(B.nextToken())).append('\n');
        }
        br.close();
        System.out.println(res);

    }

}