class Solution {
    public int countAsterisks(String s) {

        int answer = 0;
        int chk = 0;

        for (String a : s.split("")) {

            if (a.equals("|")){
                chk++;
            }
            else if (a.equals("*") && chk % 2 == 0){
                answer++;
            }
        }

        return answer;
    }
}