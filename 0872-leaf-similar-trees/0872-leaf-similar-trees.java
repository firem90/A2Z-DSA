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

    List<Integer> arr1 = new ArrayList<>();
    List<Integer> arr2 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        returnNode(root1, arr1, 0);
        returnNode(root2, arr2, 0);

        if(arr1.size() != arr2.size())
            return false;

        for(int i = 0; i < (arr1.size()); i++) {
            if(arr1.get(i) != arr2.get(i))
                return false;
        }

        return true;
    }

    public void returnNode(TreeNode root, List<Integer> ans, int i) {
        if(root == null) {
            return;
        } else if(root.left == null && root.right == null) {
            ans.add(root.val);
            return;
        } else {
            returnNode(root.left, ans, i);
            returnNode(root.right, ans, i);
        }
    }
}