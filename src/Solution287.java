class Solution287 {
  public int findDuplicate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int j = Math.abs(nums[i]);
      if (nums[j] < 0) {
        System.gc();
        return j;
      }
      nums[j] = -nums[j];
    }
    System.gc();
    return -1;
  }
}