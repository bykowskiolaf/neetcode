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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(root.val == key) {
            if (root.right == null) {
                return root.left;
            }

            if (root.left == null) {
                return root.right;
            }
    
            TreeNode inOrderSuccessor = root.right;
            while (inOrderSuccessor.left != null) {
                inOrderSuccessor = inOrderSuccessor.left;
            }

            root.val = inOrderSuccessor.val;
            root.right = deleteNode(root.right, inOrderSuccessor.val);
            
            return root;

        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
            return root;
        } else {
            root.left = deleteNode(root.left, key);
            return root;
        }
    }

}
