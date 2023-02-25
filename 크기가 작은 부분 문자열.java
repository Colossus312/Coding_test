class Solution {
    public int solution(String t, String p) {
        int length = t.length() - p.length() + 1;
        String[] arr = new String[length];
        int answer = 0;

        for(int i=0; i<length; i++){
            arr[i] = t.substring(i, p.length()+i);
            if(Long.parseLong(arr[i]) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}