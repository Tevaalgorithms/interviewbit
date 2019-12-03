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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        
        st1.push(A);
        ArrayList<Integer> list1;
        ArrayList<Integer> list2;
        
        while(!st1.isEmpty() || !st2.isEmpty()){
            
            list1 = new ArrayList<Integer>();
            
            list2 = new ArrayList<Integer>();
            
            while(!st1.isEmpty()) {
                TreeNode temp = st1.pop();
                list1.add(temp.val);
                if(temp.left != null) { st2.push(temp.left);}
                if(temp.right != null) { st2.push(temp.right);}
            }
            
            if(list1.size() > 0) {
                result.add(list1); 
            }
            
            while(!st2.isEmpty()) {
                TreeNode temp = st2.pop();
                list2.add(temp.val);
                 if(temp.right != null) { st1.push(temp.right); }
                 if(temp.left != null) { st1.push(temp.left); }
            }
            
            if(list2.size() > 0) {
                result.add(list2); 
            }
          
        }
        
        return result;
    }
}
