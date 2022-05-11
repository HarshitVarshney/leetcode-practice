/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        if (root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        String result = "";
        
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node == null){
                result = result+"#,";
            } else {
                result = result +node.val + ",";
                stack.push(node.right);
                stack.push(node.left);
            }
        }
        System.out.println(result.substring(0, result.length()-1));
        return result.substring(0, result.length()-1);
        
    }

    static int t;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null) {
            return null;
        }
        t= 0;
        String [] tokens = data.split(",");
        return deserializeHelper(tokens);
        
    }
    
    private TreeNode deserializeHelper(String [] tokens) {
        if (t<tokens.length && tokens[t].equals("#")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(tokens[t]));
        t++;
        root.left = deserializeHelper(tokens);
        t++;
        root.right = deserializeHelper(tokens);
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));