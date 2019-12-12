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
    
    private int pIndex = 0;
    
    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() < 0 || B.size() < 0) return null;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < A.size(); i++) {
            map.put(A.get(i), i);
        }
        
        pIndex = B.size() - 1;
        
        return createTree(0, A.size() - 1, B, map);
    }
    
     private TreeNode createTree(int start, int end, 
                               ArrayList<Integer> postOrder, 
                               Map<Integer, Integer> inOrder) {

        if(start > end) {
            return null;
        }

        TreeNode node = new TreeNode(postOrder.get(pIndex--));

        if(start == end) {
            return node;
        }

        int inOrderIndex = inOrder.get(node.val);
        
        node.right = createTree(inOrderIndex + 1, end, postOrder, inOrder);
        
        node.left = createTree(start, inOrderIndex - 1, postOrder, inOrder);
        
        return node;
    }
}
