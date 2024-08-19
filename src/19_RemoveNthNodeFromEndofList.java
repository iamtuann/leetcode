class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode start = head;
        while(start != null) {
            start = start.next;
            len++;
        }
        if(len==n) {
            return head.next;
        }
        int count = len-n;
        int i=1;
        ListNode q = head;
        while(i<count) {
            q = q.next;
            i++;
        }
        q.next = q.next.next;
        return head;
    }
}
