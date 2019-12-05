public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> re = new  ArrayList<Integer>();
        Stack<Integer> st = new Stack<Integer>();
        int j = 0;
        for(int i = 1; i <= A.length(); i++){
            if(A.charAt(i-1) == 'I') {
                st.push(i);
                while(!st.isEmpty()){
                    re.add(st.pop());
                }
            } else 
                st.push(i);
            
        }
        st.push(A.length() + 1);
        while(!st.isEmpty()){
            re.add(st.pop());
        }
        return re;
    }
}
