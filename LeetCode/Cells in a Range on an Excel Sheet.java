class Solution {
    public List<String> cellsInRange(String s) {
        char sc = s.charAt(0);
        char ec = s.charAt(3);
        char sr = s.charAt(1);
        char er = s.charAt(4);

        List<String> answer = new ArrayList<>();

        for (char i = sc; i <= ec; i++) {
            for (char j = sr; j <= er; j++) {
                answer.add(String.format("%c%c", i, j));
            }
        }

        return answer;
    }
}