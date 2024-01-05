class Solution {
    public int solution(String s) {
        return splitString(s).length;
    }

    private static String[] splitString(String s) {
        if (s.isEmpty()) {
            return new String[0];
        }

        char x = s.charAt(0);
        int countX = 0;
        int countOther = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                countX++;
            } else {
                countOther++;
            }

            if (countX == countOther) {
                String firstPart = s.substring(0, i + 1);
                String[] remainingParts = splitString(s.substring(i + 1));
                String[] combined = new String[remainingParts.length + 1];
                combined[0] = firstPart;
                System.arraycopy(remainingParts, 0, combined, 1, remainingParts.length);
                return combined;
            }
        }

        return new String[]{s};
    }
}