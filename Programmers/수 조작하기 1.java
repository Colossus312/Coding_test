class Solution {
    public int solution(int n, String control) {
        return control.chars().reduce(n, (acc, c) -> c == 'w' ? acc + 1 : c == 's' ? acc - 1 : c == 'd' ? acc + 10 : c == 'a' ? acc - 10 : acc);
    }
}