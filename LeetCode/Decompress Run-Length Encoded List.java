class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int num = 0;
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++)
                list.add(nums[i+1]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}