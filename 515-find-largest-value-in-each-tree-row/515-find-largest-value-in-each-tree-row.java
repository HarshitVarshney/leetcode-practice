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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue <TreeNode> queue = new LinkedList<>();
        if (root == null)
            return result;
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            int maxAtThislevel = Integer.MIN_VALUE;
            for (int i=0;i<size;i++) {
                TreeNode data = queue.poll();
                maxAtThislevel = Math.max(maxAtThislevel, data.val);
                

                if (data.left != null) {
                    queue.add(data.left);
                }

                if (data.right != null) {
                    queue.add(data.right);
                }
            }
            result.add(maxAtThislevel);
            
        }
        return result;
        
        
    }
}