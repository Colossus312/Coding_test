import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double limit = Double.parseDouble(br.readLine());
        String[] data = br.readLine().split(" ");
        double max = 0;
        double sum = 0;
        for(String dt : data){
            double A = Double.parseDouble(dt);
            if(A > max){
                max = A;
            }
            sum += A;
        }
        br.close();
        System.out.println((sum*100)/max/limit);
    }

}