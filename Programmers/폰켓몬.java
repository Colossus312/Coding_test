import java.util.*;

class Solution {
    public int solution(int[] nums) {

        int numsLength = nums.length/2;

        ArrayList<Integer> newList = new ArrayList<>();

        for(Integer item : nums){
            if(!newList.contains(item))
                newList.add(item);
        }


        return numsLength < newList.size() ? numsLength : newList.size();
    }
}