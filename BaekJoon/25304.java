import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int diff = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 0; i < A; i++){
            String[] B = br.readLine().split(" ");
            result += (Integer.parseInt(B[0])*Integer.parseInt(B[1]));
        }
        if(diff == result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}