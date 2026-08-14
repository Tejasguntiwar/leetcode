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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        int a = l1.val + l2.val;
        ListNode l3;
        if(a > 9) {
            l3 = new ListNode(a%10);
            c = 1;
        } else {
            l3 = new ListNode(a);
        }
        ListNode l3head = l3;
        
        l1 = l1.next;
        l2 = l2.next;
        while(l1 != null && l2 != null) {
            int add = l1.val + l2.val + c;
            if(add > 9) {
                int d = add % 10;
                l3.next = new ListNode(d);
                c = 1;
            } else {
                // if(add == 9 && c == 1) {
                //     l3.next = new ListNode(0);
                //     c = 1;
                // }
                // else if(add == 9) 
                // l3.next = new ListNode(9);
                // else
                l3.next = new ListNode(add);
                c=0;
            }
            l3 = l3.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            int add = l1.val + c;
            if(add > 9) {
                int d = add % 10;
                l3.next = new ListNode(d);
                c = 1;
            }
            else {
                l3.next = new ListNode(add);
                c=0;
            }
            l3 = l3.next;
            l1 = l1.next;
        }
        while(l2 != null) {
            int add = l2.val + c;
            if(add > 9) {
                int d = add % 10;
                l3.next = new ListNode(d);
                c = 1;
            }
            else {
                l3.next = new ListNode(add);
                c=0;
            }
            l3 = l3.next;
            l2 = l2.next;
        }
        if(c == 1) {
            l3.next = new ListNode(1);
        }
        return l3head;
    }
}