class Solution {
    public int[] solution(String[] park, String[] routes) {
        int H = park.length;
        int W = park[0].length();

        int startX = -1, startY = -1;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (park[i].charAt(j) == 'S') {
                    startX = i;
                    startY = j;
                    break;
                }
            }
            if (startX != -1) {
                break;
            }
        }

        int x = startX, y = startY;

        for (String route : routes) {
            String[] parts = route.split(" ");
            String direction = parts[0];
            int distance = Integer.parseInt(parts[1]);

            int tempX = x, tempY = y;

            for (int d = 0; d < distance; d++) {
                if (direction.equals("N")) {
                    tempX--;
                } else if (direction.equals("S")) {
                    tempX++;
                } else if (direction.equals("W")) {
                    tempY--;
                } else if (direction.equals("E")) {
                    tempY++;
                }

                if (tempX < 0 || tempX >= H || tempY < 0 || tempY >= W || park[tempX].charAt(tempY) == 'X') {
                    break;
                }
            }

            if (!(tempX < 0 || tempX >= H || tempY < 0 || tempY >= W || park[tempX].charAt(tempY) == 'X')) {
                x = tempX;
                y = tempY;
            }
        }

        return new int[]{x, y};
    }
}