import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        for(int i = 0; i < A; i++){
            String[] B = br.readLine().split(" ");
            System.out.println(Integer.parseInt(B[0])+Integer.parseInt(B[1]));
        }
    }

}