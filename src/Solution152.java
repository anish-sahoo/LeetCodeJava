public class Solution152 {
  // basic dp solution, uses too much memory for a few test cases
  public int maxProduct(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    double[][] dp = new double[nums.length][nums.length];
    double max = -Double.POSITIVE_INFINITY;
    for (int i = 0; i < dp.length; i++) {
      dp[i][i] = nums[i];
      for (int j = i; j < dp.length; j++) {
        if (j != i) {
          dp[i][j] = nums[j] * dp[i][j - 1];
        }
        max = Math.max(max, dp[i][j]);
      }
    }
    return (int) max;
  }

  // more efficient
  public int maxProduct2(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    double max = -Double.POSITIVE_INFINITY;
    for (int i = 0; i < nums.length; i++) {
      double prev = 1;
      for (int j = i; j < nums.length && nums[i] != 0; j++) {
        prev = prev * nums[j];
        max = Math.max(max, prev);
      }
    }
    return (int) max;
  }

  // only one fast enough to work
  public int maxProduct3(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    double maxSoFar = nums[0];
    double minSoFar = nums[0];
    double result = maxSoFar;
    for (int i = 1; i < nums.length; i++) {
      int a = nums[i];
      double tempMaxSoFar = Math.max(a, Math.max(minSoFar * a, maxSoFar * a));
      minSoFar = Math.min(a, Math.min(minSoFar * a, maxSoFar * a));
      maxSoFar = tempMaxSoFar;
      result = Math.max(result, maxSoFar);
    }
    return (int) result;
  }

  public static void main(String[] args) {
    System.out.println(new Solution152().maxProduct2(new int[]{-3, 0, 1, -2}));
    System.out.println(new Solution152().maxProduct2(new int[]{-2, 3, -4}));
    System.out.println(new Solution152().maxProduct2(new int[]{-2, 3, -2, -4}));
    System.out.println(new Solution152().maxProduct2(new int[]{0, 2}));
    System.out.println(new Solution152().maxProduct2(new int[]{0, 10, 10, 10, 10, 10, 10, 10, 10, 10, -10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 0}));
    System.out.println(new Solution152().maxProduct3(new int[]{-3, 0, 1, -2}));
    System.out.println(new Solution152().maxProduct3(new int[]{-2, 3, -4}));
    System.out.println(new Solution152().maxProduct3(new int[]{-2, 3, -2, -4}));
    System.out.println(new Solution152().maxProduct3(new int[]{0, 2}));
    System.out.println(new Solution152().maxProduct3(new int[]{0, 10, 10, 10, 10, 10, 10, 10, 10, 10, -10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 0}));
    System.out.println(new Solution152().maxProduct(new int[]{-3, 0, 1, -2}));
    System.out.println(new Solution152().maxProduct(new int[]{-2, 3, -4}));
    System.out.println(new Solution152().maxProduct(new int[]{-2, 3, -2, -4}));
    System.out.println(new Solution152().maxProduct(new int[]{0, 2}));
    System.out.println(new Solution152().maxProduct(new int[]{0, 10, 10, 10, 10, 10, 10, 10, 10, 10, -10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 0}));
  }
}
