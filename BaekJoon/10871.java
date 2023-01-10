import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int limit = Integer.parseInt(str[0]);
        String[] data = br.readLine().split(" ");
        int diff = Integer.parseInt(str[1]);
        StringBuilder result = new StringBuilder("");
        for(int i = 0 ; i < limit ; i++){
            if(Integer.parseInt(data[i]) < diff){
                result.append(data[i]).append(" ");
            }
        }
        result.setLength(result.length()-1);
        br.close();
        System.out.println(result);
    }

}