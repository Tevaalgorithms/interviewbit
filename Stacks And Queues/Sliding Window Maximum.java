import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        Deque<Integer> list = new LinkedList();
         
         // Stage 1: Fill the elements upto window size from 0th index
         for(int i= 0; i < B; i++) {
           
             while (!list.isEmpty() && A.get(list.getLast()) < A.get(i)) {
                 list.removeLast();
             }
             
             list.addLast(i);
         }
         
         ArrayList<Integer> results = new ArrayList();
         
         // Stage 2: Now we need to consider the rest of the elements. 
         for (int i = B; i < A.size(); i++ ) {
            results.add(A.get(list.getFirst())); 
            
            // Step 2: A: A: check whether the given index from the list 
            // is in the current window index
            
            while(!list.isEmpty() && (list.getFirst() < (i - B + 1))){
                list.removeFirst();
            }
            
            // Step 2: B: If the given element is greater than the last element's index from
            // list, REMOVE the LAST elements from list
            // until the list element is greate than the current element
            while(!list.isEmpty() && (A.get(list.getLast()) < A.get(i))) {
                list.removeLast();
            }
            
            // Step 2: C: Now, add the specific index to the list 
            list.add(i);
         }
         
         // Step 3: 
         results.add(A.get(list.getFirst())); 
         
         return results;
    }
}
