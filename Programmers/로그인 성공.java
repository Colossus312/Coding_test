import java.util.Arrays;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        return Arrays.stream(db).anyMatch(u -> u[0].equals(id_pw[0]) && u[1].equals(id_pw[1])) ? "login" : Arrays.stream(db).anyMatch(u -> u[0].equals(id_pw[0])) ? "wrong pw" : "fail";
    }
}