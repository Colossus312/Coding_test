/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null) return null;

        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> cq = new LinkedList<>();

        q.offer(original);
        cq.offer(cloned);

        while(!q.isEmpty()){

            TreeNode originCur = q.poll();
            TreeNode cloneCur = cq.poll();

            if(originCur == target) return cloneCur;

            if(originCur.left != null) q.offer(originCur.left);
            if(cloneCur.left != null) cq.offer(cloneCur.left);
            if(originCur.right != null) q.offer(originCur.right);
            if(cloneCur.right != null) cq.offer(cloneCur.right);
        }

        return null;
    }
}