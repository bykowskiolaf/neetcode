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

        if (maxDepth(root) == -1) {
            return false;
        }

        return true;    
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        // Since this node is not null, were by default at least one deep
        int maxDepthLeft = 1 + maxDepth(root.left); 
        int maxDepthRight = 1 + maxDepth(root.right);

        if (maxDepthLeft == 0 || maxDepthRight ==0) {
            return -1;
        }

        if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1) {
            return -1;
        }

        return Math.max(maxDepthLeft, maxDepthRight);
    }

    
}
