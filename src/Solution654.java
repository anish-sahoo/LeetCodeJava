/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution654 {
  public TreeNode constructMaximumBinaryTree(int[] nums) {
    TreeNode root = new TreeNode();
    makeTree(root, 0, nums.length - 1, nums);
    return root;
  }

  public void makeTree(TreeNode root, int start, int end, int[] nums) {
    int maxIndex = -1, max = 0;
    for (int i = start; i <= end; i++) {
      if (nums[i] >= max) {
        max = nums[i];
        maxIndex = i;
      }
    }
    root.val = max;
    if (maxIndex > start) {
      root.left = new TreeNode();
      makeTree(root.left, start, maxIndex - 1, nums);
    }
    if (maxIndex < end) {
      root.right = new TreeNode();
      makeTree(root.right, maxIndex + 1, end, nums);
    }
  }
}