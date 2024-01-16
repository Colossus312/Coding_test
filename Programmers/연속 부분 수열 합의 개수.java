import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        int length = elements.length;
        Set<Integer> sums = new HashSet<>();

        for (int subSeqLength = 1; subSeqLength <= length; subSeqLength++) {
            for (int i = 0; i < length; i++) {
                int subSeqSum = 0;
                for (int j = i; j < i + subSeqLength; j++) {
                    subSeqSum += elements[j % length];
                }
                sums.add(subSeqSum);
            }
        }

        return sums.size();
    }
}