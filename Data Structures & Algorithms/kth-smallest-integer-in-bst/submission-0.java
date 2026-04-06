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
    int seenSoFar;
    Integer result;

    public int kthSmallest(TreeNode root, int k) {
        seenSoFar = 0;
        calculateSmallest(root, k);
        return result;
    }

    private void calculateSmallest(TreeNode root, int k) {
        if(root == null || result != null) return;

        calculateSmallest(root.left, k);
        seenSoFar++;
        
        if (seenSoFar == k) {
            result = root.val;
            return;
        }

        calculateSmallest(root.right, k);
    }
}
