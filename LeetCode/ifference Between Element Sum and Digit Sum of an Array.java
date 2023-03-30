class Solution {
    public int differenceOfSum(int[] nums) {
        int a = 0;
        String b = "";
        for(int i : nums){
            a+=i;
            b = b + Integer.toString(i);
        }
        int c = 0;
        for(String s : b.split("")){
            c+=Integer.parseInt(s);
        }
        return Math.abs(a-c);
    }
}