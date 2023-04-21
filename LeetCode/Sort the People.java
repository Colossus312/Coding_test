class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        Integer[] idx = new Integer[names.length];

        for(int i = 0; i < names.length; i++){
            idx[i] = i;
        }

        Arrays.sort(idx, (a,b)->(heights[b]-heights[a]));

        String[] answer = new String[names.length];

        for(int i = 0; i < names.length; i++){
            answer[i] = names[idx[i]];
        }

        return answer;
    }
}