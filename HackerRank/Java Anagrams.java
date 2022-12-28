import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toUpperCase();
        b = b.toUpperCase();
        String[] alpha = {"A", "B", "C", "D", "E", "F","G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R","S", "T", "U", "V", "W", "X","Y", "Z"};
        int[] Ar = new int[26];
        int[] Br = new int[26];
        boolean flag = true;
        for(int i = 0; alpha.length-1 > i; i++){
            int aCount = a.length() - a.replace(alpha[i], "").length();
            int bCount = b.length() - b.replace(alpha[i], "").length();
            Ar[i] = aCount;
            Br[i] = bCount;
        }
        for(int i = 0; 26 > i ;i ++){
            if(Ar[i] == Br[i]){

            }else{
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
