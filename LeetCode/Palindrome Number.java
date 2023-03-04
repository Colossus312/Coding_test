class Solution {
    public boolean isPalindrome(int x) {
        String xx = String.valueOf(x);
        StringBuilder sb = new StringBuilder(xx);

        return sb.reverse().toString().equals(xx) ? true : false;
    }
}