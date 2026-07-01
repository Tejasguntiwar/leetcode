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


        getEls(root.left, list);
        list.add(root.val);
        getEls(root.right, list);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        getEls(root1, list1);
        getEls(root2, list2);

        // Collections.sort(list);
        List<Integer> list3 = new ArrayList<>();
        int i = 0, j = 0;
        while(i < list1.size() && j < list2.size()) {
            if(list1.get(i) < list2.get(j)) {
                list3.add(list1.get(i));
                i++;
            }
            else {
                list3.add(list2.get(j));
                j++;
            }
        }
        while(i < list1.size()) {
            list3.add(list1.get(i++));
        }
        while(j < list2.size()) {
            list3.add(list2.get(j++));
        }
        return list3;
    }
}