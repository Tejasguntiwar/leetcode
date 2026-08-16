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
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         int s = 0;
//         ListNode temp = head;
//         while(temp != null) {
//             temp = temp.next;
//             s++;
//         }
//         if(s == n) {
//             head = head.next;
//             return head;
//         }
//         int i = 1;
//         ListNode prev = head;
//         while(i< s-n) {
//             prev = prev.next;
//             i++;
//         }
//         prev.next = prev.next.next;
//         return head;
//     }
// }
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c = 0;
        ListNode t = head;
        while(t != null) {
            c++;
            t = t.next;
        }
        if(c == n) {
            head = head.next;
            return head;
        }

        // System.out.println(c);
        int i = 1;
        t = head;
        while(i < c-n) {
            t = t.next;
            i++;
        }
        // if(n == 1) t.next = null;
        // else
        t.next = t.next.next;
        return head;
    }
}