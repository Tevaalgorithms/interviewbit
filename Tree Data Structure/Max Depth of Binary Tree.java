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
    public int maxDepth(TreeNode A) {
         if(A == null) return 0;
        if(A.left == null && A.right == null) return 1;
        if(A.left == null) return maxDepth(A.right) + 1;
        if(A.right == null) return maxDepth(A.left) + 1;
        return Math.max(maxDepth(A.right), maxDepth(A.left)) + 1;
    }
}
