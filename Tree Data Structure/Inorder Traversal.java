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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
         ArrayList<Integer> result = new  ArrayList<Integer>();
         inOrder(A, result);
         return result;
    }
    
    // Left -> Root -> Right
    public void inOrder(TreeNode A, ArrayList<Integer> result) {
        if(A == null) return;
        inOrder(A.left, result);
        result.add(A.val);
        inOrder(A.right, result);
    }
    
}
