/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reorderList(ListNode A) {
       
        if(A == null) return A;
        
        // Step 1: Split the list into two 
        ListNode root = A; 
        ListNode slow = root;
        ListNode fast = slow.next;
        
        while(fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        
        ListNode second = slow.next;
        slow.next = null;
        // Now we have two lists: head & second 
            
            
        // Step 2: Reverse the second list 
        ListNode r = reverseOrder(second);
        
        ListNode temp = root;
        
        while(temp!= null && r!= null) {
            ListNode next1 = temp.next;
            temp.next = r;
            ListNode rNext = r.next;
            r.next = next1;
            r = rNext;
            temp = next1;
        }
        
        return root;
    }
    
    public ListNode reverseOrder(ListNode A) {
        
        ListNode prev = null;

        ListNode curr = A;

        ListNode next = null;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    
    }
}
