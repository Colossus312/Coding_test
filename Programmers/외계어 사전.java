import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] spell, String[] dic) {
        return Arrays.stream(dic).anyMatch(dicWord -> Arrays.stream(dicWord.split("")).sorted().collect(Collectors.joining()).equals(Arrays.stream(spell).sorted().collect(Collectors.joining())) && dicWord.length() == spell.length) ? 1 : 2;
    }
}