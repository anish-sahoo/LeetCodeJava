public class Solution543 {
    int d;
    public int diameterOfBinaryTree(TreeNode root) {
        d = 0;
        getDiameter(root);
        return d;
    }
    private int getDiameter(TreeNode root) {
        if(root == null) {
            return 0;
        }
        
        int l = getDiameter(root.left);
        int r = getDiameter(root.right);

        d = Math.max(d, l + r);
        return 1 + Math.max(l, r);
    }
}

// https://leetcode.com/problems/diameter-of-binary-tree/description/