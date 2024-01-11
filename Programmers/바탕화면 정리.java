class Solution {
    public int[] solution(String[] wallpaper) {
        int n = wallpaper.length;
        int m = wallpaper[0].length();

        int lux = n, luy = m, rdx = -1, rdy = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (i < lux) lux = i;
                    if (j < luy) luy = j;
                    if (i > rdx) rdx = i;
                    if (j > rdy) rdy = j;
                }
            }
        }

        return new int[]{lux, luy, rdx+1, rdy+1};
    }
}