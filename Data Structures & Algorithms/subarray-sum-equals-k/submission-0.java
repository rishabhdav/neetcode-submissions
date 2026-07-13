class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int prefix=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            prefix=prefix+nums[i];

            if(map.get(prefix-k)!=null){
                res=res+map.get(prefix-k);

            }

            if(map.get(prefix)!=null){
                int cnt=map.get(prefix);
                cnt++;
                map.put(prefix,cnt);
            }
            else map.put(prefix,1);
        }
        return res;
    }
}