class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasum=0;
        int costsum=0;
        int n=gas.length;
        int res=0;
        for(int i=0;i<n;i++){
            gasum=gasum+gas[i];
            costsum=costsum+cost[i];
        }
        if(gasum<costsum) return -1;

        int total=0;
        for(int i=0;i<n;i++){
            total=total+(gas[i]-cost[i]);
            if(total<0){
                total=0;
                res=i+1;
            }
        }
return res;
    }
}
