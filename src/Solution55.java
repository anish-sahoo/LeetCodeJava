class Solution55 {
  public boolean canJump(int[] nums) {
    int index = 0;
    while (index < nums.length - 1 && nums[index] != 0) {
      int maxJump = 0;
      for (int i = index + 1; i <= Math.min(index + nums[index], nums.length - 1); i++) {
        maxJump = nums[i] > nums[maxJump] ? i : maxJump;
      }
      System.out.print(index + " " + nums[index] +  " initial maxJump " + maxJump);
      maxJump = maxJump == 0 || index + nums[index] >= nums.length - 1 ? nums[index] : maxJump;
      index += maxJump;
      System.out.println(" updated maxJump " + maxJump);
    }
    System.out.println(index);
    return index >= nums.length - 1;
  }

  public static void main(String[] args) {
//    System.out.println(new Solution55().canJump(new int[]{2, 3, 1, 1, 4}));
//    System.out.println(new Solution55().canJump(new int[]{3, 2, 1, 0, 4}));
//    System.out.println(new Solution55().canJump(new int[]{2, 0, 0}));
//    System.out.println(new Solution55().canJump(new int[]{2, 5, 0, 0}));
//    System.out.println(new Solution55().canJump(new int[]{1, 2, 0, 1}));
//    System.out.println(new Solution55().canJump(new int[]{2, 0, 1, 0, 1}));
    System.out.println(new Solution55().canJump(new int[]{5,9,3,2,1,0,2,3,3,1,0,0}));
  }
}