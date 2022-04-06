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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
        
    }
        int helper(TreeNode root) {
        if (root==null) {
            return 0;
        }
        
        int leftSum = Math.max(0, helper(root.left));
        System.out.println("leftSum- "+leftSum);
        int rightSum = Math.max(0, helper(root.right));
        System.out.println("rightSum- "+rightSum);
        max = Math.max(max, leftSum + rightSum +  root.val);
        System.out.println("max- "+max);
        
        return root.val + Math.max(leftSum, rightSum);
        }
        
        
}