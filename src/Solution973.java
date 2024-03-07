import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution973 {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) -> (o2[0]*o2[0] + o2[1]*o2[1]) - (o1[0]*o1[0] + o1[1]*o1[1]));
        for(int[] point:points) {
            heap.offer(point);
            if (heap.size() > k)
                heap.poll();
        }
        return heap.toArray(new int[1][1]);
    }
    public static void main(String[] args) {
        int[][] points = {{2,10}, {-9,-9}, {0,8}, {-2,-2}, {8,9}, {-10,-7}, {-5,2}, {-4,-9}};
        int k = 7;
        Solution973 s = new Solution973();
        int[][] ans = s.kClosest(points, k);
        System.out.println();
        for (int[] point: ans) {
            System.out.println(Arrays.toString(point) + "("+ Math.sqrt(point[0]*point[0] + point[1]*point[1])+")");
        }
    }
}

// https://leetcode.com/problems/k-closest-points-to-origin/description/