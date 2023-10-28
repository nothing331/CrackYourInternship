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
    int ans = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Check if the current node's left child is a leaf
        if (isLeaf(root.left)) {
            ans += root.left.val;
        }

        // Recursively process the left and right subtrees
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);

        return ans;
    }

    // Helper function to check if a node is a leaf node
    private boolean isLeaf(TreeNode node) {
        return node != null && node.left == null && node.right == null;
    }
}