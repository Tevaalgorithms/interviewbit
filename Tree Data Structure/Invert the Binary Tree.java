/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode A) {
        // Base case
        if(A == null) return A;
        
        TreeNode tempLeft = A.left;
        A.left = A.right;
        A.right = tempLeft;
        
        invertTree(A.left);
        invertTree(A.right);
        
        return A;
        
    }
}
