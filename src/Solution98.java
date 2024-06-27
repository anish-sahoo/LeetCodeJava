
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
class Solution98 {
  public boolean isValidBST(TreeNode root) {
    return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }

  private boolean valid(TreeNode root, long min, long max) {
    if (root == null) {
      return true;
    }

    boolean left = (root.left == null) || (root.left.val >= min && root.left.val < root.val);
    boolean right = (root.right == null) || (root.right.val <= max && root.right.val > root.val);
    return left && right
        && valid(root.left, min, root.val - 1)
        && valid(root.right, root.val + 1, max);
  }
}