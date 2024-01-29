import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        reader.close();

        int layer = 1;
        int maxRoomInLayer = 1;

        while (maxRoomInLayer < N) {
            maxRoomInLayer += 6 * layer;
            layer++;
        }

        System.out.println(layer);
    }
}