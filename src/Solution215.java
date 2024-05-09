import java.util.PriorityQueue;

class Solution215 {
  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    for (int i = 0; i < nums.length; i++) {
      heap.offer(nums[i]);
    }
    while (heap.size() > k) {
      heap.poll();
    }
    return heap.peek();
  }
}