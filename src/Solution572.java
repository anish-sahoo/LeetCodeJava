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
class Solution572 {
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (root == null) {
      return false;
    }
    if (root.val == subRoot.val) {
      if (isEqual(root, subRoot)) {
        return true;
      }
    }
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }

  private boolean isEqual(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    } else if (p == null || q == null) {
      return false;
    }
    return p.val == q.val && isEqual(p.left, q.left) && isEqual(p.right, q.right);
  }
}