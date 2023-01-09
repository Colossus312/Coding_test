import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int limit = Integer.parseInt(str[0]);
        String[] data = br.readLine().split(" ");
        int max = 0;
        int min = 0;
        for(int i = 0 ; i < limit ; i++){
            if(i == 0){
                max = Integer.parseInt(data[i]);
                min = max;
            }else{
                if(max < Integer.parseInt(data[i])){
                    max = Integer.parseInt(data[i]);
                }
                if(min > Integer.parseInt(data[i])){
                    min = Integer.parseInt(data[i]);
                }
            }
        }

        br.close();
        System.out.println(min + " " + max);
    }

}