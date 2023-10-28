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
// class Solution {
//     int mainMin=Integer.MAX_VALUE;
//     public int getMinimumDifference(TreeNode root) {
//         if(root==null ||root.right==null || root.left==null){
//             return Integer.MAX_VALUE;
//         }
//         int min = Math.min(Math.abs(root.val-root.left.val),Math.abs(root.val-root.right.val));
//         mainMin = Math.min(min, mainMin);
//         getMinimumDifference(root.right);
//         getMinimumDifference(root.left);
//         return mainMin;
//     }
// }

class Solution {
    Integer prev = null;
    Integer minDiff = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return minDiff;
        }

        getMinimumDifference(root.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, Math.abs(root.val - prev));
        }

        prev = root.val;

        getMinimumDifference(root.right);

        return minDiff;
    }
}
