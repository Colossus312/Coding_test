import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());

        for(int i = 0; i < limit ; i++){
            String[] data = br.readLine().split(" ");
            double sum = 0;
            double cnt = 0;
            double limit2 = Double.parseDouble(data[0]);
            for(int j = 1; limit2+1 > j; j++){
                double A = Double.parseDouble(data[j]);
                sum += A;
            }
            sum = sum/limit2;
            for(int k = 1; limit2+1 > k; k++){
                double B = Double.parseDouble(data[k]);
                if(sum < B){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",(cnt/limit2)*100);

        }
        br.close();
    }
}