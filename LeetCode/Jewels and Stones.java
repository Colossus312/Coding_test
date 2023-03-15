class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        String[] arr1 = jewels.split("");
        String[] arr2 = stones.split("");
        int answer = 0;
        for(String a : arr1){
            for(String b : arr2){
                if(a.equals(b)){
                    answer++;
                }
            }
        }
        return answer;
    }
}