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
    public int lca(TreeNode A, int B, int C) {
        
      //The serialization of a binary tree follows a level order description of 
      // left and right child of nodes, where -1 signifies a NULL child
      if(find(A, B) != true || find(A, C) != true) {
          return -1;
      }
      
      TreeNode res = lcaHelper(A, B, C);
      
      if(res != null) {
          return res.val;
      }
      
      return -1;
    }
    
    public TreeNode lcaHelper(TreeNode root, int B, int C) {
        
        if(root == null) return null;
        
        if(root.val == B || root.val == C) {
                return root;
        }
        
        TreeNode left = lcaHelper(root.left, B, C);
        
        TreeNode right = lcaHelper(root.right, B, C);
        
        if(left != null && right != null){
            return root;
        } else {
            if(left != null) return left;
            else return right;
        }
    }
    
    boolean find(TreeNode root, int val) {
        if(root == null) {
            return false;
        }
        if(root.val == val) {
            return true;
        }
        if((root.left != null && find(root.left, val)) || 
          ((root.right != null) && find(root.right, val))) {
              return true;
          }
        return false;
    }
}
