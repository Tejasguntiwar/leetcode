/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ArrayList<Integer> list;
    Random rand;
    public Solution(ListNode head) {
        list = new ArrayList<>();
        rand = new Random();
        ListNode node = head;
        while(node != null) {
            list.add(node.val);
            node = node.next;
        }
    }

    // private void create(ListNode node, ArrayList<Integer> list) {
    //     if(node == null) return;
    //     list.add(node.val);
    //     create(node.next, list);
    // }
    
    public int getRandom() {
        int idx = rand.nextInt(list.size());
        return list.get(idx);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */