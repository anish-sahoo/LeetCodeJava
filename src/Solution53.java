public class Solution53 {
  // greedy approach
  public int maxSubArray(int[] nums) {
    double sum = 0;
    double max = nums[0];
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      max = Math.max(sum, max);
      sum = Math.max(0, sum);
    }
    return (int) max;
  }
}
