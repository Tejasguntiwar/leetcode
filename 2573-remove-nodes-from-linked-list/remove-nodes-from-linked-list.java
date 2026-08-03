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
    private void getNodes(ListNode node, ArrayList<Integer> list) {
        if(node == null) return;
        list.add(node.val);
        getNodes(node.next, list);
    }
//     private void setNodes(ListNode node, Stack<Integer> st) {
//         if(st.isEmpty()) return;
// // In Java, when you pass an object reference into a method, it is passed by value. Reassigning node inside setNodes only points that local variable to a new memory address. It does not change the .next pointer of the parent node that called it.
//         node = new ListNode(st.pop());
//         setNodes(node.next, st);
//     }
    // public ListNode removeNodes(ListNode head) {    //O(n) time //O(n) space
    //     ArrayList<Integer> list = new ArrayList<>();
    //     Stack<Integer> st = new Stack<>();

    //     getNodes(head,list);
        
    //     int max = list.get(list.size()-1);
        
    //     st.push(list.get(list.size()-1));
        
    //     for(int i = list.size()-2; i>=0; i--) {
    //         if(max <= list.get(i)) {
    //             max = list.get(i);
    //             st.push(list.get(i));
    //         }
    //     }
    //     ListNode dummy = new ListNode(0);
    //     ListNode curr = dummy;

    //     while(!st.isEmpty()) {
    //         curr.next = new ListNode(st.pop());
    //         curr = curr.next;
    //     }
    //     return dummy.next;
    // }
    public ListNode removeNodes(ListNode head) {    //O(n) time //O(n) space
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        ListNode curr = head;
        while(curr!=null) {
            while(!st.isEmpty() && st.peek() < curr.val) {
                st.pop();
            }
            st.push(curr.val);
            curr = curr.next;
        }

        ListNode nxt = null;

        while(!st.isEmpty()) {
            curr = new ListNode(st.pop());
            curr.next = nxt;
            nxt = curr;
        }
        return nxt;
    }
}