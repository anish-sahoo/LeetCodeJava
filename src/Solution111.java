class Solution111 {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int lDepth = minDepth(root.left);
        int rDepth = minDepth(root.right);
        if(root.left == null){
            return 1 + rDepth;
        }
        if(root.right == null){
            return 1 + lDepth;
        }
        return 1+Math.min(lDepth, rDepth);
    }
}