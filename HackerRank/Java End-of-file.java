import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int flag = 0;
        int i = 1;
        while(flag != 1) {
            try {
                System.out.println(i + " "+scan.nextLine());
                i++;
            }catch(Exception e) {
                flag = 1;
            }
        }
    }
}
