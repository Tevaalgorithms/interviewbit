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
    public int hasPathSum(TreeNode A, int B) {
        if (A == null)
            return 0;
            
        // this means we reached the leaf node
        if (A.left == null && A.right == null)
            return (A.val == B) ? 1 : 0;
        
        return hasPathSum(A.left, B - A.val) | hasPathSum(A.right, B - A.val);
    }
}
