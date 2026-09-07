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
    // private void getNo(ListNode node, StringBuilder sb) {
    //     if(node == null) return;
    //     sb.append(node.val);
    //     getNo(node.next, sb);
    // }
    // private void makeNo(ListNode node, StringBuilder sb, int i) {
    //     if(i == sb.length()) return;
    //     int d = sb.charAt(i) - '0'; 
    //     node.val = d;
    //     makeNo(node.next, sb, i+1);
    // }
    private int makeNo(ListNode node) {
        if(node == null) return 0;
        int carry = makeNo(node.next);
        int n2 = carry + (node.val+node.val);
        node.val = n2%10;
        if(n2 > 9) carry = n2/10;
        else carry = 0;
        return carry;
    }
    public ListNode doubleIt(ListNode head) {
        // StringBuilder sb = new StringBuilder("");
        // getNo(head,sb);
        // System.out.println(sb);
        // int n = Integer.valueOf(sb.toString());
        // n = n * 2;
        // String nStr = String.valueOf(n);
        // StringBuilder sb2 = new StringBuilder(nStr);
        // System.out.println(sb2);
        // if(sb.length()<sb2.length()) {
        //     int extraDigit = sb2.charAt(0) - '0'; 
        //     ListNode dummy = new ListNode(extraDigit);
        //     dummy.next = head;
        //     makeNo(dummy.next, sb2, 1);
        //     return dummy;
        // } else {
        //     makeNo(head, sb2, 0);
        //     return head;
        // }
        int n = makeNo(head);
        if(n != 0) {
            ListNode dummy = new ListNode(n);
            dummy.next = head;
            return dummy;
        } else {
            return head;
        }
    }
}