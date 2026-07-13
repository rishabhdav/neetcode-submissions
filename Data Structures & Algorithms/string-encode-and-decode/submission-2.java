class Solution {
    public String encode(List<String> strs) {
        if (strs.isEmpty())
            return "";

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            String ans = strs.get(i);
            str.append(ans.length()).append("#").append(strs.get(i));
        }

        return str.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty())
            return new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();

        int n = str.length();
        int i = 0;
        while (i < n) {
int j=i;
while(str.charAt(j)!='#') j++;

int len=Integer.parseInt(str.substring(i,j));
String ans1=str.substring(j+1,j+1+len);
list.add(ans1);
i=j+1+len;



        }

        return list;
    }
}
