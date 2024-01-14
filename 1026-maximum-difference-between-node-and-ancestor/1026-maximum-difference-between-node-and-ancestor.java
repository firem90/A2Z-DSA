/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int res;
    public int maxAncestorDiff(TreeNode root) {
        dfs(root, root.val, root.val);
        return res;
    }

    public void dfs(TreeNode node,int max,int min){
        if(node == null){
            res = Math.max(res, Math.abs(max-min));
            return;
        }
        max = Math.max(node.val, max);
        min = Math.min(node.val, min);
        dfs(node.left, max, min);
        dfs(node.right, max, min);
    }

}