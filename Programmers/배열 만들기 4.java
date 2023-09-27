import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr).boxed().reduce(new ArrayList<Integer>(), (list, val) -> { while (!list.isEmpty() && list.get(list.size() - 1) >= val) list.remove(list.size() - 1); list.add(val); return list; }, (l1, l2) -> l1).stream().mapToInt(i -> i).toArray();
    }
}