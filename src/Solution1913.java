import java.util.Arrays;

// Runtime - 7ms, Beats 81.09% of users with Java
// memory - 43.82mb, Beats 91.84% of users with Java

public class Solution1913 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-2] * nums[nums.length-1]) - (nums[0] * nums[1]);
    }
}
