class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            c = shiftChar(c, index, skip);
            result.append(c);
        }

        return result.toString();
    }

    private static char shiftChar(char c, int index, String skip) {
        for (int i = 0; i < index; i++) {
            c = (char)(((c - 'a' + 1) % 26) + 'a');
            while (skip.indexOf(c) != -1) {
                c = (char)(((c - 'a' + 1) % 26) + 'a');
            }
        }
        return c;
    }
}