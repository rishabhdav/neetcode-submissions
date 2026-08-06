class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String s = operations[i];
            if (s.charAt(0)=='C') {
                st.pop();
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
                System.out.println(s.charAt(0)-'0');
                    st.push(Integer.parseInt(operations[i]));
                
            }
        }

        int sum=0;
        while(!st.isEmpty()){
            sum=sum+st.pop();
        }
        return sum;
    }
}