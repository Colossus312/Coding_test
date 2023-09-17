import java.util.*;

class Solution {
    public int solution(int[] arr) {
        return new Object() { List<int[]> history = new ArrayList<int[]>() {{ add(Arrays.copyOf(arr, arr.length)); }}; int solve(int[] input) { int i = 0; while(true) { input = Arrays.stream(input).map(n -> n >= 50 && n % 2 == 0 ? n / 2 : n < 50 && n % 2 == 1 ? n * 2 + 1 : n).toArray(); for(int[] prev : history) { if(Arrays.equals(prev, input)) return i; } history.add(Arrays.copyOf(input, input.length)); i++; } } }.solve(arr);
    }
}