import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        String B=sc.next();
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        /* Enter your code here. Print output to STDOUT. */      System.out.println(A.length()+B.length());

        if(A.compareTo(B) <= 0){
            System.out.println("No");
            System.out.println(A + " " + B);
        }else{
            System.out.println("Yes");
            System.out.println(A + " " + B);
        }



    }
}



