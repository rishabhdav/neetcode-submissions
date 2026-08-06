class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
            int sum=0;
        for (int i = 0; i < operations.length; i++) {
            String s = operations[i];
            if (s.charAt(0)=='C') {
               sum=sum-st.pop();
                continue;
            } else if (st.size() >= 2 && s.charAt(0) == '+') {
                int firstval = st.pop();
                int secondval = st.pop();
                int newval = firstval + secondval;

                st.push(secondval);
                st.push(firstval);
                st.push(newval);
            } 
            
            else if(s.charAt(0) == 'D'){
                st.push(st.peek()*2);
            }
            else {
                
                    st.push(Integer.parseInt(operations[i]));
                
            }
            sum=sum+st.peek();
        }

    
        
        return sum;
    }
}