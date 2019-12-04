/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    
    public int lPalin(ListNode A) {
        
    if(A == null)
        return 1;
 
    ListNode p = A;
    
    ListNode prev = new ListNode(A.val);
 
    while(p.next != null){
        ListNode temp = new ListNode(p.next.val);
        temp.next = prev;
        prev = temp;
        p = p.next;
    }
 
    ListNode p1 = A;
    
    ListNode p2 = prev;
 
    while(p1!=null){
        if(p1.val != p2.val)
            return 0;
 
        p1 = p1.next;
        p2 = p2.next;
    }
    return 1;
    }
   
}
