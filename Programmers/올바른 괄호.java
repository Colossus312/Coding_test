class Solution {
    boolean solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            answer += s.charAt(i) == "(".charAt(0) ? 1 : -1;
            if (answer < 0) return false;
        }

        return answer == 0 ? true : false;
    }
}