class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String regex1 = "^[A-Z]*$";
        String regex2 = "^[a-z]*$";
        String regex3 = "^[A-Za-z]*$";
        n = n % 26;

        for(int i = 0 ; i < s.length(); i++){
            String ca =  Character.toString(s.charAt(i));
            int ascii = (int) s.charAt(i) + n;
            if(ca.matches(regex1)){
                if(ascii > 90){
                    ascii -= 26;
                }
                answer += (char) ascii;
            }else if(ca.matches(regex2)){
                if(ascii > 122){
                    ascii -= 26;
                }
                answer += (char) ascii;
            }else if(!ca.matches(regex3)){
                answer += ca;
            }
        }
        return answer;
    }
}