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
    int maxDiameterSoFar;

    public Solution() {
        maxDiameterSoFar = 0;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameterSoFar = 0;
        maxDepth(root);
        return maxDiameterSoFar;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        // Since this node is not null, were by default at least one deep
        int maxDepthLeft = maxDepth(root.left);
        int maxDepthRight = maxDepth(root.right);

        maxDiameterSoFar = Math.max(maxDiameterSoFar, maxDepthLeft + maxDepthRight);

        return 1 + Math.max(maxDepthLeft, maxDepthRight);
    }

}
