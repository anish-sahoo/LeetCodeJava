public class ListNode {
    //use this as the class for all ListNode/LinkedList type problems
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    static void toString(String label, ListNode answer) {
        System.out.print(label + "\t");
        while (answer != null) {
            System.out.print(answer.val + ", ");
            answer = answer.next;
        }
        System.out.println();
    }
}
