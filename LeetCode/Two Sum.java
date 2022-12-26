import java.util.Hashtable;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer> hash = new Hashtable<>(); //해쉬테이블 사용
        for(int i = 0; i < nums.length; i++){
            if(hash.get(nums[i]) != null){ //key에 대응하는 값이 나오면 위치를 반환
                int[] result = new int[2];
                result[0] = hash.get(nums[i]);
                result[1] = i;
                return result;
            }
            hash.put(target-nums[i],i); //필요한 값을 key로 입력
        }
        return nums;
    }
}