import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = Integer.parseInt(str);
        int diff = result;
        int i = 0;
        while (true) {
            int B = result / 10;
            int C = result % 10;
            result = C * 10 + (B + C) % 10;
            i++;
            if(diff == result){
                break;
            }
        }

        br.close();
        System.out.println(i);
    }

}