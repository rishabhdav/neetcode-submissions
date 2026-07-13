class Solution {

public String encode(List<String> strs) {


StringBuilder str=new StringBuilder();
for(int i=0;i<strs.size();i++){
   
  if(!strs.get(i).isEmpty()) str.append(strs.get(i)).append("#");
}

return str.toString();
    }

public List<String> decode(String str) {
  
ArrayList<String>list=new ArrayList<>();
String[] arr=str.split("#");
for(int i=0;i<arr.length;i++){
    list.add(arr[i]);
}
return list;
    }
}
