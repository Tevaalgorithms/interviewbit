public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
         
        ArrayList<Integer> output = new  ArrayList<Integer>();
         
        // Create an empty stack
        Stack<Integer> s = new Stack<>();
        
        
        for(int i=0; i < A.size(); i++) {
            
            while((s.peek() >= A.get(i) && !s.isEmpty())) {
                s.pop();
            }
            
            if(s.isEmpty()){
               output.add(-1);
            } else {
                output.add(s.peek());
            }
            
            s.push(A.get(i));
        }
        
        return output;
    }
}
