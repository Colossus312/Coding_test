import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> currentEmployees = new HashSet<>();

        for(int i = 0; i < n; i++) {
            String[] record = br.readLine().split(" ");
            String name = record[0];
            String action = record[1];

            if(action.equals("enter")) {
                currentEmployees.add(name);
            } else if(action.equals("leave")) {
                currentEmployees.remove(name);
            }
        }

        ArrayList<String> sortedEmployees = new ArrayList<>(currentEmployees);
        Collections.sort(sortedEmployees, Collections.reverseOrder());

        for(String name : sortedEmployees) {
            System.out.println(name);
        }
    }
}