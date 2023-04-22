class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int answer = 0;

        for (int[] a : grid){
            Arrays.sort(a);
        }
        for (int j = 0; j < grid[0].length; ++j) {
            int greatest = 0;
            for (int i = 0; i < grid.length; ++i){
                greatest = Math.max(greatest, grid[i][j]);
            }
            answer += greatest;
        }

        return answer;
    }
}