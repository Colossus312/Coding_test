import java.util.*;

public class Main {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int time = (B + C)/60;
        int minute = (B + C)%60;
        A = A + time;
        if (A == 24){
            A = 0;
        }else if(A > 24){
            A = A-24;
        }
        System.out.println(A + " " + minute);

    }

}