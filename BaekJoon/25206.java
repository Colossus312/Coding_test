import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Double> gradePoints = new HashMap<>();
        gradePoints.put("A+", 4.5);
        gradePoints.put("A0", 4.0);
        gradePoints.put("B+", 3.5);
        gradePoints.put("B0", 3.0);
        gradePoints.put("C+", 2.5);
        gradePoints.put("C0", 2.0);
        gradePoints.put("D+", 1.5);
        gradePoints.put("D0", 1.0);
        gradePoints.put("F", 0.0);

        double totalPoints = 0;
        double totalCredits = 0;

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] parts = line.split(" ");
            String grade = parts[2];
            double credits = Double.parseDouble(parts[1]);

            if (!grade.equals("P")) {
                totalPoints += credits * gradePoints.get(grade);
                totalCredits += credits;
            }
        }

        double gpa = totalCredits > 0 ? totalPoints / totalCredits : 0;
        System.out.printf("%.6f\n", gpa);
    }
}