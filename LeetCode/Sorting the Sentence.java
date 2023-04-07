class Solution {
    public String sortSentence(String s) {
        String[] sArr = new String[s.split(" ").length];
        String answer = "";
        for(String a : s.split(" ")){
            String[] arr = a.split("");
            int arrNum = Integer.parseInt(arr[arr.length-1]) - 1;
            a = a.substring(0, a.length()-1);
            sArr[arrNum] = a;
        }
        for(String b : sArr){
            answer = answer + b + " ";
        }
        return answer.substring(0, answer.length()-1);
    }
}