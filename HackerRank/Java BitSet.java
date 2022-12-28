import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int bit = sc.nextInt();
        BitSet[] bitset = new BitSet[]{new BitSet(bit),new BitSet(bit)};
        int next = sc.nextInt();
        for(int i = 0; i < next; i++){
            String a = sc.next();
            int b = sc.nextInt();
            int c = sc.nextInt();
            b--;
            c--;
            if(a.equals("AND")){
                bitset[b].and(bitset[c]);
            }else if(a.equals("OR")){
                bitset[b].or(bitset[c]);
            }else if(a.equals("XOR")){
                bitset[b].xor(bitset[c]);
            }else if(a.equals("SET")){
                c++;
                bitset[b].set(c,true);
            }else if(a.equals("FLIP")){
                c++;
                bitset[b].flip(c);
            }else{

            }
            System.out.println(bitset[0].cardinality()+" "+bitset[1].cardinality());
        }
    }
}
