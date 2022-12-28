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
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        //List<Integer> qq = q;
        //q.sort(Comparator.naturalOrder());
        int result = 0;
        for (int i = 0; i < q.size(); i++) {
            if(q.get(i) > i+1+2){
                System.out.println("Too chaotic");
                return;
            }
        }
        for(int i = 0; i < q.size(); i++){
            if(q.get(i) > i+1){
                for (int j = i+1; j < q.size(); j++) {
                    int k = q.get(i);
                    q.set(i,q.get(j));
                    q.set(j,k);
                    result++;
                    if(q.get(i) == i+1){
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                Result.minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
