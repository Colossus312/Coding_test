class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> answer = new ArrayList<>();

        int max = 0;
        for(int i : candies)
            max = Math.max(max, i);

        for(int j : candies) {
            int num = j + extraCandies;

            if(num >= max) answer.add(true);
            else answer.add(false);
        }

        return answer;
    }
}