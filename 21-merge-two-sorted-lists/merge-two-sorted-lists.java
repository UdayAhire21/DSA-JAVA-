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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Temporary anchor to easily track the start of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        
        // Walk through both lists and attach the smaller value
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        
        // Attach whichever list still has remaining nodes
        tail.next = (list1 != null) ? list1 : list2;
        
        // The actual merged list starts right after the dummy node
        return dummy.next;
    }
}