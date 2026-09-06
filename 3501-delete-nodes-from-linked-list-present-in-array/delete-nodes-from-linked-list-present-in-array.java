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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);
        ListNode temp = head;
        while(set.contains(temp.val)) temp = temp.next;
        ListNode newHead = temp;
        ListNode last = temp;
        temp = temp.next;
        while(temp != null && temp.next != null) {
            while(temp != null && set.contains(temp.val)) {
                last.next = temp.next;
                temp = temp.next;
            }
            last = last.next;
            if(temp == null) break;
            temp = temp.next;
        }
        if(temp != null && set.contains(temp.val)) {
            last.next = null;
        }
        return newHead;
    }
}