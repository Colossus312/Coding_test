import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        return arr1.length > arr2.length ? 1 :
                arr2.length > arr1.length ? -1 :
                        Integer.compare(Arrays.stream(arr1).sum(), Arrays.stream(arr2).sum());
    }
}