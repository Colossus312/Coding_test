import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList> lines = new ArrayList<ArrayList>();
        for(int i = 0; i < n ; i++){
            int d = scan.nextInt();
            ArrayList<Integer> line = new ArrayList<Integer>();
            for(int ii = 0; ii < d ;ii++){
                line.add(scan.nextInt());
            }
            lines.add(line);
        }

        int q = scan.nextInt();
        for(int i = 0; i < q; i++){
            int x = scan.nextInt()-1;
            int y = scan.nextInt()-1;
            try{
                System.out.println(lines.get(x).get(y));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
