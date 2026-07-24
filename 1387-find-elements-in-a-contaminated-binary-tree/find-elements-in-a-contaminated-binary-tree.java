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
class FindElements {
    TreeNode root;
    HashSet<Integer> set = new HashSet<>();
    private int c = 0;
    private void count(TreeNode root, int last) {
        if(root == null) return;
        set.add(last);
        count(root.left,last*2+1);
        count(root.right,last*2+2);
    }
    public FindElements(TreeNode root) {
        count(root,0);
        // set.add(0);
        // int last = 0;
        // for(int i = 1; i<c; i++) {
        //     set.add(last*2+1);
        //     set.add(last*2+2);
        //     last = 
        // }
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */

// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class FindElements {
//     TreeNode root;
//     HashSet<Integer> set = new HashSet<>();
//     private void create(TreeNode root, HashSet<Integer> set, int last) {
//         if(root == null) return;

//         root.val = last;

//         if(root.left != null)
//         set.add(last*2+1);
//         if(root.right != null)
//         set.add(last*2+2);

//         create(root.left,set);
//     }
//     public FindElements(TreeNode root) {
//         this.root = root;
//         create(this.root,set,0);
//     }
    
//     public boolean find(int target) {
        
//     }
// }

// /**
//  * Your FindElements object will be instantiated and called as such:
//  * FindElements obj = new FindElements(root);
//  * boolean param_1 = obj.find(target);
//  */