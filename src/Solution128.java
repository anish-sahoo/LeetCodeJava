import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Arrays;

public class Solution128 {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }

        HashSet<Integer> a = new HashSet<>();
        for(int n: nums){
            a.add(n);
        }
        Integer[] arr = a.toArray(new Integer[0]);
        Arrays.sort(arr);

        int count = 1, maxcount = 0, i = 1;
        do {
            if(arr[i] - arr[i-1] == 1){
                count++;
                if(count >= maxcount){
                    maxcount = count;
                }
            }
            else count = 1;
        }
        while (++i < arr.length);
        return maxcount;
    }

    public static void main(String[] args) {
        System.out.println(new Solution128().longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
        System.out.println(new Solution128().longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
