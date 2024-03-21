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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        dsa(result, root);
        return result;
    }

    public void dsa(List<Integer> result, TreeNode root){
        if(root == null){
            return;
        }

        if(root.left != null){
            dsa(result,root.left);
        }

        result.add(root.val);
        
        if(root.right != null){
            dsa(result, root.right);
        }
    }
}