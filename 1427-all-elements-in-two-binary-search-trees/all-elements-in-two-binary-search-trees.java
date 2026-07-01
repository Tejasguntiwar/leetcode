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
    private void getEls(TreeNode root, List<Integer> list) {
        if(root == null) return;

        list.add(root.val);

        getEls(root.left, list);
        getEls(root.right, list);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        getEls(root1, list);
        getEls(root2, list);

        Collections.sort(list);
        return list;
    }
}