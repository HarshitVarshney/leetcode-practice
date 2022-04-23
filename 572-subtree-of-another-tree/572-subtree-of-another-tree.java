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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (checkIftreesAreSame(root, subRoot)) {
            return true;
        } 
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    
    }
    
    boolean checkIftreesAreSame (TreeNode startroot, TreeNode subRoot) {
        
        if (startroot == null && subRoot == null) {
            return true;
        }
        
        if (startroot == null || subRoot == null) {
            return false;
        } 
        
        if (startroot.val != subRoot.val) {
            return false;
        }
        
        return checkIftreesAreSame(startroot.left, subRoot.left) && checkIftreesAreSame(startroot.right, subRoot.right);
    }
        
}

