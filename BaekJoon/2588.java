import java.util.*;

public class Main {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        String[] C = Integer.toString(B).split("");

        for(int i = 0; i < C.length; i++){
            System.out.println(A*(Integer.parseInt(C[C.length-i-1])));
        }

        System.out.println(A*B);

    }

}