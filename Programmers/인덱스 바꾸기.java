class Solution {
    public String solution(String my_string, int num1, int num2) {
        return new StringBuilder(my_string)
                .replace(num1, num1 + 1, String.valueOf(my_string.charAt(num2)))
                .replace(num2, num2 + 1, String.valueOf(my_string.charAt(num1)))
                .toString();
    }
}