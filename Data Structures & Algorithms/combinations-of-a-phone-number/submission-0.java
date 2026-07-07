class Solution {
    public List<String> letterCombinations(String digits) {

        if(digits.isEmpty()) return new ArrayList<>();
 Map<Character, String> map = new HashMap<>();

map.put('2', "abc");
map.put('3', "def");
map.put('4', "ghi");
map.put('5', "jkl");
map.put('6', "mno");
map.put('7', "pqrs");
map.put('8', "tuv");
map.put('9', "wxyz");
List<String>list=new ArrayList<>();
SolveIt(0,map,list,new StringBuilder(),digits);
return list;

    }

    public static  void SolveIt(int idx,Map<Character, String> map ,List<String>list,StringBuilder str,String digits){

        if(str.length()==digits.length()){
            list.add(str.toString());
            return;
        }

        String str1=map.get(digits.charAt(idx));

        for(char ch:str1.toCharArray()){
            str.append(ch);
            SolveIt(idx+1,map,list,str,digits);
            str.deleteCharAt(str.length()-1);

        }
    }
}
