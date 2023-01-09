import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int limit = Integer.parseInt(str);
        String[] data = br.readLine().split(" ");
        int diff = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 0 ; i < limit ; i++){
            if(Integer.parseInt(data[i]) == diff){
                result++;
            }
        }

        br.close();
        System.out.println(result);
    }

}