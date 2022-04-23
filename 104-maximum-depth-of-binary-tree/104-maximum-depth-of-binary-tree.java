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
    public int maxDepth(TreeNode root) {
        return maxDepthHelper(root, 0);
    }
    
   int maxDepthHelper(TreeNode root, int height) {
       if (root == null) {
           return height;
       }
       System.out.println(height);
       
       int leftHeight = maxDepthHelper(root.left, height+1);
       int rightHeight = maxDepthHelper(root.right, height+1);
       return Math.max(leftHeight,rightHeight);
   }
}