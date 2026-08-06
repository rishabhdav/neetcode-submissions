class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String s = operations[i];
            if (s.charAt(0) >= '1' && s.charAt(0) <= '9') {
                st.push(s.charAt(0) - '0');
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
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
        }

        int sum=0;
        while(!st.isEmpty()){
            sum=sum+st.pop();
        }
        return sum;
    }
}