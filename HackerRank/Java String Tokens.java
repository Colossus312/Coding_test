import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim();
        if( s.length() == 0 ) {
            System.out.println(0);
            return;
        }
        if(s.length() == 1){
            System.out.println(1);
            System.out.println(s);
            return;
        }

        String[] ss = s.split("[^a-zA-Z]+");
        // Write your code here.
        System.out.println(ss.length);
        for(int i = 0 ; ss.length > i;  i++){
            System.out.println(ss[i]);
        }

    }
}

