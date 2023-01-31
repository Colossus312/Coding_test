import java.util.*;
class Solution {
    public long solution(long n) {
        String[] s = Long.toString(n).split("");
        String ss = "";
        Arrays.sort(s,Collections.reverseOrder());

        for(int i=0;i<s.length;i++){
            ss+=s[i];
        }

        return Long.parseLong(ss);
    }
}