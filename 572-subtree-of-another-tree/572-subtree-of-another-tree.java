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
//     public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//         if (root == null) return false;
//         if (checkIftreesAreSame(root, subRoot)) {
//             return true;
//         } else {
//             return checkIftreesAreSame(root.left, subRoot) || checkIftreesAreSame(root.right, subRoot);
//         }
//     }
    
//     Boolean checkIftreesAreSame (TreeNode startroot, TreeNode subRoot) {
        
//         if (startroot == null && subRoot == null) {
//             return true;
//         }
        
//         if (startroot == null || subRoot == null) {
//             return false;
//         } 
        
//         if (startroot.val != subRoot.val) {
//             return false;
//         }
        
//         return checkIftreesAreSame(startroot.left, subRoot.left) && checkIftreesAreSame(startroot.right, subRoot.right);
        
        
        
//     }
    
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        if (isSame(s, t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        
        if (s.val != t.val) return false;
        
        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }
    
    
}

