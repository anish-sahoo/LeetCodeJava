import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution295 {
}

class MedianFinder {
  PriorityQueue<Integer> minHeap, maxHeap;

  public MedianFinder() {
    minHeap = new PriorityQueue<>();
    maxHeap = new PriorityQueue<>((a,b) -> b-a);
  }

  public void addNum(int num) {
    if(maxHeap.isEmpty() || num <= maxHeap.peek()) {
      maxHeap.offer(num);
    }
    else minHeap.offer(num);

    if (maxHeap.size() > minHeap.size() + 1) {
      minHeap.offer(maxHeap.poll());
    } else if (minHeap.size() > maxHeap.size()) {
      maxHeap.offer(minHeap.poll());
    }
  }

  public double findMedian() {
    if (maxHeap.size() > minHeap.size()) {
      return maxHeap.peek();
    }
    return (maxHeap.peek() + minHeap.peek()) / 2.0;
  }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */