class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            System.gc();
            return null;
        }
        ListNode pointer = head;
        while(pointer != null){
            while (pointer.next != null && pointer.val == pointer.next.val){
                pointer.next = pointer.next.next;
            }
            pointer = pointer.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode question = new ListNode(1, new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode answer = new Solution83().deleteDuplicates(question);
        ListNode.toString("answer",answer);
    }
}