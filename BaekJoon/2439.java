import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());
        String star = "";
        for(int i = 0; i < limit; i++){
            int limit2 = limit - 1 - i;
            String trim = "";
            for(int j = 0; j < limit2 ; j++){
                trim += " ";
            }
            star += "*";
            System.out.println(trim+star);
        }
        br.close();

    }

}