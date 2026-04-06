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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

        return isValidBST(root, new int[] {-1001, 1001});
    }

    public boolean isValidBST(TreeNode root, int[] range) {
        if(root == null) return true;

        if(root.val <= range[0] || root.val >= range[1]) return false;

        int[] leftRange = new int[] {range[0], root.val};
        int[] rightRange = new int[] {root.val, range[1]};

        boolean isLeftSubTreeValid = isValidBST(root.left, leftRange);
        boolean isRightSubTreeValid = isValidBST(root.right, rightRange); 
    
        return isLeftSubTreeValid && isRightSubTreeValid; 
    }
}
