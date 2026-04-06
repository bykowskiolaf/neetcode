/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        boolean isLeftSubTreeBalanced = isBalanced(root.left);
        boolean isRightSubTreeBalanced = isBalanced(root.right);

        return isLeftSubTreeBalanced && isRightSubTreeBalanced && (Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1); 
    
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        // Since this node is not null, were by default at least one deep
        int maxDepthLeft = 1;
        int maxDepthRight = 1;

        maxDepthLeft += maxDepth(root.left);
        maxDepthRight += maxDepth(root.right);

        return Math.max(maxDepthLeft, maxDepthRight);
    }

    
}
