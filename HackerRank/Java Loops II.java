import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        String ans = "";
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int j = b;
            int l = 0;
            ans = "";
            for(int ii=0; ii < n ; ii++){
                int pow = (int) Math.pow(2,ii);
                j = b*pow;
                l = l + j;
                ans += a+l + " ";
            }
            System.out.println(ans);
        }

        in.close();

    }
}
