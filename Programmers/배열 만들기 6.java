import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        return (new LinkedList<Integer>() {{
            for (int num : arr) {
                if (isEmpty() || peekLast() != num) addLast(num);
                else removeLast();
            }
        }}).isEmpty() ? new int[]{-1} : (new LinkedList<Integer>() {{
            for (int num : arr) {
                if (isEmpty() || peekLast() != num) addLast(num);
                else removeLast();
            }
        }}).stream().mapToInt(i -> i).toArray();
    }
}