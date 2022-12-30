import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());
        String star = "";
        for(int i = 0; i < limit; i++){
            star += "*";
            System.out.println(star);
        }
        br.close();

    }

}