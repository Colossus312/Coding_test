import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String[] ss = s.split(":");
        String ampm = ss[ss.length-1].substring(2);
        String[] sss = s.replace(ampm, "").split(":");
        if(ampm.equals("PM")){
            int a = Integer.parseInt(sss[0])+12;
            a = a == 24 ? a -= 12 :
                    a > 24 ? a -= 24 :
                            a;
            String add = "";
            if(a < 10){
                add = "0" + Integer.toString(a);
            }else{
                add = Integer.toString(a);
            }
            sss[0] = add;
        }else{
            int a = Integer.parseInt(sss[0]);
            a = a == 12 ? a = 0:
                    a > 12 ? a -= 12 :
                            a;
            String add = "";
            if(a < 10){
                add = "0" + Integer.toString(a);
            }else{
                add = Integer.toString(a);
            }
            sss[0] = add;
        }

        return sss[0] + ":" + sss[1] + ":" + sss[2];
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
