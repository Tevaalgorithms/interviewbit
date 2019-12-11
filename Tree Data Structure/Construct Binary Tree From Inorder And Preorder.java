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
    
    static int pIndex = 0;
    
    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() < 0 || B.size() < 0) return null;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < B.size(); i++) {
            map.put(B.get(i), i);
        }
        
        pIndex = 0;
        
        return createTree(0, B.size() - 1, A, map);
    }
    
    public TreeNode createTree(int start, int end, 
                               ArrayList<Integer> preOrder, 
                               Map<Integer, Integer> inOrder) {

        if(start > end) {
            return null;
        }

        TreeNode node = new TreeNode(preOrder.get(pIndex++));

        if(start == end) {
            return node;
        }

        int inOrderIndex = inOrder.get(node.val);

        node.left = createTree(start, inOrderIndex - 1, preOrder, inOrder);

        node.right = createTree(inOrderIndex + 1, end, preOrder, inOrder);

        return node;
    }
}
