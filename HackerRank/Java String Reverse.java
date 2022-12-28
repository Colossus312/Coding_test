import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String[] AA = A.split("");
        boolean flag = true;
        for(int i = 0; A.length()-1 > i ;i ++){
            int a = A.length()-1-i;
            if(AA[i].equals(AA[a])){

            }else{
                flag = false;
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */

    }
}



