import java.util.*;

// runtime - 6ms, beats 45.58%
// memory - 42.24mb, beats 99.87%

public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 || lists == null){
            System.gc();
            return null;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        for(ListNode a:lists){
            while(a != null){
                pq.offer(a.val);
                a = a.next;
            }
        }
        if(pq.isEmpty()){
            System.gc();
            return null;
        }
        ListNode answer = new ListNode(), pointer = answer;
        while(!pq.isEmpty()){
            pointer.val = pq.poll();
            if(!pq.isEmpty()){
                pointer.next = new ListNode();
                pointer = pointer.next;
            }
        }
        System.gc();
        return answer;
    }
}
