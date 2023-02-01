class Solution {
    public boolean solution(int x) {
        int a = 0;
        for(String z : Integer.toString(x).split("")){
            a += Integer.parseInt(z);
        }
        boolean answer = x%a == 0 ? true : false;
        return answer;
    }
}