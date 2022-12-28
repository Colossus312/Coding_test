import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double plus = 0;
        double minus = 0;
        double zero = 0;
        for(int i = 0; i<arr.size(); i++) {
            double dt = arr.get(i);
            dt = dt == 0 ? zero++ :
                    dt > 0 ? plus++ :
                            minus++;
        }
        System.out.println(Math.round(plus/arr.size()*1000000)/1000000.0);
        System.out.println(Math.round(minus/arr.size()*1000000)/1000000.0);
        System.out.println(Math.round(zero/arr.size()*1000000)/1000000.0);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
