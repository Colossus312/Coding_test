import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());

        int cnt = 0;
        String chk = "";
        int result = 0;
        for(int i = 0; i < limit ; i++){
            String[] data = br.readLine().split("");
            for(String dt : data){
                if(dt.equals("O")){
                    result++;
                    if(chk.equals("O")){
                        cnt++;
                        result += cnt;
                    }else {
                        cnt = 0;
                    }
                }else{
                }
                chk = dt;
            }
            System.out.println(result);
            chk = "";
            result = 0;
            cnt = 0;
        }
        br.close();
    }
}