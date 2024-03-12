import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Member {
    int age;
    String name;
    int joinOrder;

    public Member(int age, String name, int joinOrder) {
        this.age = age;
        this.name = name;
        this.joinOrder = joinOrder;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Member[] members = new Member[N];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            members[i] = new Member(age, name, i);
        }

        Arrays.sort(members, (m1, m2) -> {
            if (m1.age == m2.age) {
                return m1.joinOrder - m2.joinOrder;
            } else {
                return m1.age - m2.age;
            }
        });

        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }
    }
}