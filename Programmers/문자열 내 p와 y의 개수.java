class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();

        int p = s.length()-s.replaceAll("p","").length();
        int y = s.length()-s.replaceAll("y","").length();

        boolean answer = p - y == 0 ? true : false;

        return answer;
    }
}