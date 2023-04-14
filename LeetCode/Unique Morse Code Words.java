class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> answer = new HashSet<>();
        for (String a: words) {
            String b = new String();
            for (char c: a.toCharArray()) {
                b = b + morse[c - 'a'];
            }
            answer.add(b);
        }

        return answer.size();
    }
}