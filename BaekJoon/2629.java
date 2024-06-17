import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numWeights = sc.nextInt();
        int[] weights = new int[numWeights];

        for (int i = 0; i < numWeights; i++) {
            weights[i] = sc.nextInt();
        }

        int numBeads = sc.nextInt();
        int[] beads = new int[numBeads];

        for (int i = 0; i < numBeads; i++) {
            beads[i] = sc.nextInt();
        }

        Set<Integer> possibleWeights = new HashSet<>();
        possibleWeights.add(0);

        for (int weight : weights) {
            Set<Integer> newWeights = new HashSet<>(possibleWeights);
            for (int pw : possibleWeights) {
                newWeights.add(pw + weight);
                newWeights.add(Math.abs(pw - weight));
            }
            possibleWeights = newWeights;
        }

        StringBuilder result = new StringBuilder();
        for (int bead : beads) {
            if (possibleWeights.contains(bead)) {
                result.append("Y ");
            } else {
                result.append("N ");
            }
        }

        System.out.println(result.toString().trim());
    }
}