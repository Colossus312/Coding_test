import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        return IntStream.range(0, arr.length)
                .mapToObj(i -> flag[i] ? Collections.nCopies(arr[i] * 2, arr[i]) : Collections.nCopies(arr[i], -1))
                .flatMap(Collection::stream)
                .reduce(new ArrayList<Integer>(),
                        (list, elem) -> {
                            if (elem == -1) {
                                list.remove(list.size() - 1);
                            } else {
                                list.add(elem);
                            }
                            return list;
                        },
                        (list1, list2) -> {
                            list1.addAll(list2);
                            return list1;
                        })
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}