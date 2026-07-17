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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < lists.length; i++) {
            ListNode t = lists[i];
            while(t!= null) {
                list.add(t.val);
                t = t.next;
            }
        }
        if(list.size() == 0) return null;
        Collections.sort(list);
        // for(int no : list)
        // System.out.println(no);
        ListNode root = new ListNode(list.get(0));
        ListNode temp = root;
        for(int i = 1; i< list.size(); i++) {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return root;
    }
}