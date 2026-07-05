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
    private int rightSum = 0;
    private void great(TreeNode root) {
        if(root == null) return;

        great(root.right);
        rightSum += root.val;
        root.val = rightSum;
        great(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        great(root);
        return root;
    }
}