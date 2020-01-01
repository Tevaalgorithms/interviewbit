public class Solution {
    public ListNode swapPairs(ListNode A) {
       if(A == null || A.next == null)
            return A;
            
        ListNode current = A;
        while(current != null && current.next != null) {
            int temp = current.val;
            current.val = current.next.val;
            current.next.val = temp;
            current = current.next.next;
        }

        return A;
    }
}
