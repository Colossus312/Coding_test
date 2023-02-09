class Solution {
    public String solution(String s) {
        String[] ss = s.split("");
        if(s.length()%2 == 0){
            return ss[s.length()/2-1] + ss[s.length()/2];
        }else{
            return ss[s.length()/2];
        }
    }
}