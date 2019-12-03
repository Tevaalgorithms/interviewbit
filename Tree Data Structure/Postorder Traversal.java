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
    
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
       ArrayList<Integer> result = new ArrayList<Integer>();
       postOrder(A, result);
       return result;
    }
    // Post Order : Left, Right, Root
    public void postOrder(TreeNode A,  ArrayList<Integer> result) {
        if(A == null) return;
        postOrder(A.left, result);
        postOrder(A.right, result);
        result.add(A.val);
    }
}
