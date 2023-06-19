class Solution {
    public int solution(String str1, String str2) {
        return str1.length() > str1.replaceAll(str2,"").length() ? 1 : 2;
    }
}