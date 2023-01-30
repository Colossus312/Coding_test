class Solution {
    public int solution(String s) {
        int answer = s.length() >= s.replaceAll("-","").length() ? Integer.parseInt(s) : -1*Integer.parseInt(s);
        return answer;
    }
}