class Solution {
    public int solution(String myString, String pat) {
        return myString.length() > myString.toLowerCase().replace(pat.toLowerCase(),"").length() ? 1 : 0;
    }
}