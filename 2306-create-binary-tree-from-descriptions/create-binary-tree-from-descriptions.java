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
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        for(int i = 0; i < descriptions.length; i++) {
            if(map.containsKey(descriptions[i][0])) {
                TreeNode child = null;
                if(!map.containsKey(descriptions[i][1]))
                child = new TreeNode(descriptions[i][1]);
                else 
                child = map.get(descriptions[i][1]);

                if(descriptions[i][2] == 1) {
                    map.get(descriptions[i][0]).left = child;
                } else {
                    map.get(descriptions[i][0]).right = child;
                }
                map.put(child.val, child);
            } else {
                TreeNode child = null;
                if(!map.containsKey(descriptions[i][1]))
                child = new TreeNode(descriptions[i][1]);
                else 
                child = map.get(descriptions[i][1]);

                TreeNode parent = new TreeNode(descriptions[i][0]);
                if(descriptions[i][2] == 1) {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
                map.put(parent.val, parent);
                map.put(child.val, child);
            }
        }
        TreeNode root = null;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < descriptions.length; i++) {
            set.add(descriptions[i][1]);
        }
        for(int i = 0; i < descriptions.length; i++) {
            if(!set.contains(descriptions[i][0])) {
                root = map.get(descriptions[i][0]);
                break;
            }
        }
        return root;
    }
}


// class Solution {
//     public TreeNode createBinaryTree(int[][] descriptions) {
//         HashSet<TreeNode> nums = new HashSet<>();
//         HashMap<Integer, TreeNode> nodes = new HashMap<>();
//         for(int i = 0; i < descriptions.length; i++) {
//             int n = description[i][1];
//             nums.add(n);
//             if(!nodes.containsKey(n)) {
//                 map.put(n, new TreeNode(n));
//             }
//         }

//         for(int i = 0; i < descriptions.length; i++) {
//             if(map.containsKey(descriptions[i][0])) {
//                 TreeNode newNode = new TreeNode(descriptions[i][1]);
//                 if(descriptions[i][2] == 1) {
//                     map.get(descriptions[i][0]).left = newNode;
//                 } else {
//                     map.get(descriptions[i][0]).right = newNode;
//                 }
//                 map.put(newNode.val, newNode);
//             } else {
//                 TreeNode child = null;
//                 if(!map.containsKey(descriptions[i][1]))
//                 child = new TreeNode(descriptions[i][1]);
//                 else 
//                 child = map.get(descriptions[i][1]);

//                 TreeNode parent = new TreeNode(descriptions[i][0]);
//                 if(descriptions[i][2] == 1) {
//                     parent.left = child;
//                 } else {
//                     parent.right = child;
//                 }
//                 map.put(parent.val, parent);
//                 map.put(child.val, child);
//             }
//         }

//         for(int i = 0; i < descriptions.length; i++) {
//             if(!nums.contains(description[i][0])) root = map.get(description[i][1]);
//         }
//         return root;
//     }
// }