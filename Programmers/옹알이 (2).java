class Solution {
    public int solution(String[] babbling) {
        String[] sounds = {"aya", "ye", "woo", "ma"};
        int count = 0;

        for (String word : babbling) {
            if (isValid(word, sounds)) {
                count++;
            }
        }

        return count;
    }
    private static boolean isValid(String word, String[] sounds) {
        String lastSound = "";
        for (int i = 0; i < word.length();) {
            boolean foundSound = false;
            for (String sound : sounds) {
                if (word.startsWith(sound, i) && !sound.equals(lastSound)) {
                    i += sound.length();
                    lastSound = sound;
                    foundSound = true;
                    break;
                }
            }
            if (!foundSound) {
                return false;
            }
        }
        return true;
    }
}