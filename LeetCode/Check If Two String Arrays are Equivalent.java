class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String strOne = "";
        String strTwo = "";
        for(String a : word1){
            strOne = strOne + a;
        }
        for(String b : word2){
            strTwo = strTwo + b;
        }
        return strOne.equals(strTwo);
    }
}