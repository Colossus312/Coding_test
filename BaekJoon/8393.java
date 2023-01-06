import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int result = (A+1)*(A/2);
        if(A%2 != 0){
            result += (A/2) + 1;
        }
        System.out.println(result);
    }

}