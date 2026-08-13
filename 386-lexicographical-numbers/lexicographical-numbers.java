class Solution {
    public class Node {
        Node[] childs = new Node[10];
        boolean eow = false;
        Node() {
            for(int i = 0; i < 10; i++) {
                childs[i] = null;
            }
        }
    }
    public Node root = new Node();
    private void insert(String n) {
        Node curr = root;
        for(int i = 0; i<n.length(); i++) {
            int idx = n.charAt(i) - '0';
            if(curr.childs[idx] == null) {
                curr.childs[idx] = new Node();
            }
            curr = curr.childs[idx];
        }
        curr.eow = true;
    }
    private void getNums(Node curr, int currNum, ArrayList<Integer> list) {
        if (curr == null) return;

        if(curr.eow) list.add(currNum);

        for(int i = 0; i<10; i++) {
            if(curr.childs[i] != null) {
                // Construct the next number mathematically (e.g., 1 -> 10 -> 100)
                getNums(curr.childs[i], currNum * 10 + i, list);
            }
        }
    }
    public List<Integer> lexicalOrder(int n) {
        for(int i = 1; i <= n; i++) {
            insert(String.valueOf(i));
        }
        ArrayList<Integer> list = new ArrayList<>();
        getNums(root, 0, list);
        return list;
    }
}