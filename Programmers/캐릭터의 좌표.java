import java.util.Arrays;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        return Arrays.stream(keyinput).reduce(new int[]{0, 0}, (pos, dir) -> new int[]{Math.min(Math.max(dir.equals("left") ? pos[0]-1 : dir.equals("right") ? pos[0]+1 : pos[0], -board[0]/2), board[0]/2), Math.min(Math.max(dir.equals("down") ? pos[1]-1 : dir.equals("up") ? pos[1]+1 : pos[1], -board[1]/2), board[1]/2)}, (a, b) -> b);
    }
}