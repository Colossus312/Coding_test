import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a.chars().map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c)).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString());
    }
}