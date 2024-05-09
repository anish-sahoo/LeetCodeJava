import java.util.PriorityQueue;

class Solution46 {
  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b-a);
    for(int i=0; i<stones.length; i++) {
      heap.offer(stones[i]);
    }
    while(heap.size() > 1) {
      int y = heap.poll();
      int x = heap.poll();
      if(x != y) {
        y = y - x;
        heap.offer(y);
      }
    }
    return heap.isEmpty() ? 0 : heap.poll();
  }
}