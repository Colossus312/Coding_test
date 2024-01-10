import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extIndex = getColumnIndex(ext);
        int sortByIndex = getColumnIndex(sort_by);

        return Arrays.stream(data)
                .filter(item -> item[extIndex] < val_ext)
                .sorted(Comparator.comparingInt(o -> o[sortByIndex]))
                .toArray(int[][]::new);
    }
    private static int getColumnIndex(String columnName) {
        switch (columnName) {
            case "code":
                return 0;
            case "date":
                return 1;
            case "maximum":
                return 2;
            case "remain":
                return 3;
            default:
                throw new IllegalArgumentException("Invalid column name");
        }
    }
}