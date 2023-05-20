class Solution {
    public int solution(String str1, String str2) {
        return str2.length() > str2.replace(str1, "").length() ? 1 : 0;
    }
}