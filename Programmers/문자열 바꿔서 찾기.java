class Solution {
    public int solution(String myString, String pat) {
        return myString.replaceAll("A","b").replaceAll("B","a").toUpperCase().indexOf(pat) == -1 ? 0 : 1;
    }
}