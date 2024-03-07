public class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode pointer1 = head;
        int c = 0;
        while(pointer1 != null) {
            c++;
            pointer1 = pointer1.next;
        }
        c = c/2 + 1;
        for(int i=1; i<c; i++) {
            head = head.next;
        }
        return head;
    }
}

// https://leetcode.com/problems/middle-of-the-linked-list/
