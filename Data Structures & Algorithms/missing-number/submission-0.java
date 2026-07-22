class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length;  
int i=0;
while(i<n){
    int correct=nums[i];
    if(correct<n&&nums[i]!=nums[correct]){
        int temp=nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp;
    }
    else i++;
}

for(int  j=0;j<n;j++){
    if(j!=nums[j] ) return j;
}

return n;
    }
}
