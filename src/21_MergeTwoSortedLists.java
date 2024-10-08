/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode run = new ListNode(1);
        ListNode head = run;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                run.next = list1;
                run = run.next;
                list1 = list1.next;
            } else {
                run.next = list2;
                run = run.next;
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            run.next = list1;
        } else {
            run.next = list2;
        }
        return head.next;
    }
}
