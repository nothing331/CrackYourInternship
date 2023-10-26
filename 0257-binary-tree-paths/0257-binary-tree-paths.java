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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if(root!=null){
            dfs(root, "",paths);
        }
        return paths;
    }
    public void dfs(TreeNode root, String path, List<String> paths) {
        // Append the current node's value to the path
        path += root.val;

        // If this is a leaf node, add the path to the list
        if (root.right == null && root.left == null) {
            paths.add(path);
        } else {
            // If it's not a leaf node, append "->" to the path
            path += "->";
            if (root.right != null) {
                // Recursively explore the right subtree
                dfs(root.right, path, paths);
            }
            if (root.left != null) {
                // Recursively explore the left subtree
                dfs(root.left, path, paths);
            }
        }
    }
}