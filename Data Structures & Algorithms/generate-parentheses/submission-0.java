class Solution {
    public List<String> generateParenthesis(int n) {
      
        List<String>list=new ArrayList<>();
        SolveIt(new StringBuilder(),list,0,0,n);
        return list;
        
    }
    public  static void SolveIt(StringBuilder st,List<String>list,int open,int closed,int n){

if(open==closed&&n==open){
   StringBuilder str=new StringBuilder(st);
   list.add(str.toString());
   return;
}
if(open<n){
     st.append("(");
    SolveIt(st,list,open+1,closed,n);
     st.deleteCharAt(st.length() - 1);
}

if(open>closed){
    st.append(")");
    SolveIt(st,list,open,closed+1,n);
    st.deleteCharAt(st.length() - 1);
}



    }
}
