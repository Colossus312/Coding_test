class Solution {
    public String reverseWords(String s) {
        String answer = "";
        for(String a : s.split(" ")){
            answer = answer + new StringBuffer(a).reverse().toString() + " ";
        }
        return answer.substring(0, answer.length() - 1);
    }
}