import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int i= 0, start = -1, end = -1;
        ArrayList<int[]> a = new ArrayList<>();

        while(i < intervals.length){
            start = intervals[i][0];
            end = intervals[i][1];
            for (; i<intervals.length && intervals[i][0] <= end; i++) {
                start = Math.min(start, intervals[i][0]);
                end = Math.max(end, intervals[i][1]);
            }
            a.add(new int[]{start, end});
        }
        return a.toArray(new int[a.size()][2]);
    }

    public static void main(String[] args) {
        new Solution56().merge(new int[][]{
                {1,3},
                {2, 6},
                {8, 10},
                {15, 18}
        });
        new Solution56().merge(new int[][]{
                {1,4},
                {0, 1}
        });
        new Solution56().merge(new int[][]{
                {1,4},
                {0, 0}
        });
    }
}
