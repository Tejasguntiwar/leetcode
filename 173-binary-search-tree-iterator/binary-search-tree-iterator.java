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
class BSTIterator {
    private Stack<Integer> s;

    public BSTIterator(TreeNode root) {
        s = new Stack<>();
        inverseInorder(root,s);
    }
    public void inverseInorder(TreeNode root, Stack<Integer> s) {
        if(root== null) return;
        inverseInorder(root.right, s);
        s.push(root.val);
        inverseInorder(root.left, s);
    }
    public int next() {
        return s.pop();
    }
    
    public boolean hasNext() {
        return s.size() >= 1 ? true : false;
    }
}

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
// class BSTIterator {
//     private static int p;
//     private static TreeNode myRoot;
//     private static List<Integer> list;
    
//     public BSTIterator(TreeNode root) {
//         myRoot = root;
//         list = new ArrayList<>();
//         inorder(root,list);
//         // for(Integer n : list) System.out.println(n);
//         p = -1;
//     }
//     public void inorder(TreeNode root, List<Integer> list) {
//         if(root== null) return;
//         inorder(root.left, list);
//         list.add(root.val);
//         inorder(root.right, list);
//     }
//     public int next() {
//         return list.get(++p);
//     }
    
//     public boolean hasNext() {
//         if(p+1 == list.size()) return false;

//         return true;
//     }
// }

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
// class BSTIterator {
//     private static int p;
//     private static myRoot;
//     public BSTIterator(TreeNode root) {
//         while(root.left != null) root = root.left;
//         this.myRoot = root;
//         p = Integer.MIN_VALUE;
//     }
    
//     public int next() {
//         if(p == Integer.MIN_VALUE) {
//             // TreeNode temp = myRoot;
//             // while(temp.left != null) temp = temp.left;
//             while(myRoot.left != null) temp = temp.left;
//             p = temp.val;
//         } else {
//             int v = p;
//             p = myRoot.next;
//             return p;
//         }
//     }
    
//     public boolean hasNext() {
        
//     }
// }

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */