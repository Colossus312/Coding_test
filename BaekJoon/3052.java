import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;


public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Hashtable<Integer, Integer> hash = new Hashtable<>();

        String buf = "";
        while((buf = br.readLine()) != null){
            int A = Integer.parseInt(buf);
            int B = A%42;
            hash.put(B, B);
        }
        br.close();

        System.out.println(hash.size());
    }

}