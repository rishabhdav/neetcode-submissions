class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str=new StringBuilder();
        StringBuilder str1=new StringBuilder(a);
        StringBuilder str2=new StringBuilder(b);
        str1.reverse();
        str2.reverse();
        int n=Math.max(a.length(),b.length());
        int n1=a.length();
        int n2=b.length();
        int carry=0;
        for(int i=0;i<n;i++){
          int digit1=i<n1?str1.charAt(i)-'0':0;
          int digit2=i<n2?str2.charAt(i)-'0':0;
          int sum=digit1+digit2+carry;
          str.append(sum%2);
          carry=sum>>1;

          
        }
        if(carry!=0) str.append(carry);
        return str.reverse().toString();
    }
}