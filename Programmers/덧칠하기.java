class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;
        int i = 0;

        while (i < section.length) {
            int start = section[i];
            int end = start + m - 1;
            count++;

            while (i < section.length && section[i] <= end) {
                i++;
            }
        }

        return count;
    }
}