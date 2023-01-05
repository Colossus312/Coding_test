import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] data = new int[30];
        for(int i = 0 ; data.length > i; i++){
            data[i] = 0;
        }
        String buf = "";
        while((buf = br.readLine()) != null){
            int A = Integer.parseInt(buf);
            data[A-1] = 1;
        }
        br.close();
        int cnt = 0;
        for(int B : data){
            cnt++;
            if(B == 0){
                System.out.println(cnt);
            }
        }
    }

}