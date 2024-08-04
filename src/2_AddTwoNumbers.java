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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = new ListNode(0);
        ListNode process = first;
        int sd = 0;
        while (l1 != null || l2 != null || sd != 0) {
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;

            int sum = num1 + num2 + sd;
            sd = sum / 10;
            ListNode node = new ListNode(sum % 10);
            process.next = node;
            process = process.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        ListNode result = first.next;
        return result;
    }
}