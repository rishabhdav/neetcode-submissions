class Solution {
    public void reverseString(char[] s) {
        SolveIt(s);
    }
    public static void SolveIt(char[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            char temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}