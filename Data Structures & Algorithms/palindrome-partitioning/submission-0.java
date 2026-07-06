class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>list=new ArrayList<>();
      SolveIt(new ArrayList<>(),list,0,s);
      return list;

    }

    public static void SolveIt(List<String>curr,List<List<String>>list,int idx,String s){

         if(idx>s.length()) {
            
            return;
        }

        if(idx==s.length()) {
            list.add(new ArrayList<>(curr));
            return;
        }

        for(int i=idx;i<s.length();i++){
            String  ns=s.substring(idx,i+1);
            if(isStrictPalindrome(ns)){
                curr.add(ns);
                SolveIt(curr,list,i+1,s);
                curr.remove(curr.size()-1);
            }
        }

    }
    public static boolean isStrictPalindrome(String s) {
    if (s == null) return false;
    return s.equals(new StringBuilder(s).reverse().toString());
}

}
