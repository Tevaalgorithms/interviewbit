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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        preOrder(A, result);
        return result;
    }
    
    // Root > Left > Right
    public void preOrder(TreeNode A, ArrayList<Integer> result){
        if(A == null) return;
        result.add(A.val);
        preOrder(A.left, result);
        preOrder(A.right, result);
    }
}
