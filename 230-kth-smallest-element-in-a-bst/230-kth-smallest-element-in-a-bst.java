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
    int kthSmallest;
    int current = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root, k );
        return kthSmallest;
    }
    
    void inorderTraversal(TreeNode root, int k) {
        if (root== null){
            return;
        }
       
        inorderTraversal(root.left,k);
        current++;
        System.out.println(current);
         if (current == k) {
             
            kthSmallest = root.val;
             System.out.println("P="+kthSmallest);
            
        }
        inorderTraversal(root.right, k);
    }
}