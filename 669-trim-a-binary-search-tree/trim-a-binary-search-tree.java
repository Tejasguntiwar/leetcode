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
    private TreeNode delete(TreeNode root, int low, int high) {
        if(root == null) return null;
        root.left = delete(root.left, low,high);   
        root.right = delete(root.right, low,high);   
        if(root.val < low) return root.right;
        if(root.val > high) return root.left;
        return root;
    }
    public TreeNode trimBST(TreeNode root, int low, int high) {
        return delete(root,low, high);
    }
}
// class Solution {
//     // private TreeNode delete(TreeNode root) {
//     //     if(root.left == null && root.right == null) return null;
//     //     root = root.right;
//     //     while(root.left != null) root = root.left;
//     //     return root;
//     // }
//     private TreeNode deleteLeft(TreeNode root) {
//         if(root.right == null) return null;
//         root = root.right;
//         // while(root.left != null) root = root.left;
//         return root;
//     }
//     private TreeNode deleteRight(TreeNode root) {
//         if(root.left == null) return null;
//         root = root.left;
//         while(root.right != null) root = root.right;
//         return root;
//     }
//     private void traverse(TreeNode root, int low, int high) {
//         if(root == null) return;
//         if(root.val < low) {
//             root = deleteLeft(root);
//         }
//         else if(root.val > high) {
//             root = deleteRight(root);
//         }
//         else {
//             traverse(root.left, low, high);
//             traverse(root.right, low, high);
//         }
//     }
//     public TreeNode trimBST(TreeNode root, int low, int high) {
//         traverse(root,low, high);
//         return root;
//     }
// }