import java.util.*;

public class Main {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        if(B - 45 < 0){
            B = 60 + (B-45);
            A = A - 1;
            if(A < 0){
                A = 23;
            }
            System.out.println(A + " " + B);
        }else{
            System.out.println(A + " " + (B-45));
        }

    }

}