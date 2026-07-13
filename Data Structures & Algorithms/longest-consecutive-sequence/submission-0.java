class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

            int cnt=0;

          for(int i=0;i<nums.length;i++){
                if(!set.contains(nums[i]-1)){
                 int ans=1;
                 boolean flag=true;

                 while(flag==true){
                   for(int k=nums[i]+1;k<=nums[i]+nums.length;k++){
                    if(set.contains(k)){
                      ans++;
                      
                    }
                    else{
                        flag=false;
                        break;

                    }
                   }
                 }
                 cnt=Math.max(cnt,ans);

                }            

        }
        
return cnt;
    }
}
