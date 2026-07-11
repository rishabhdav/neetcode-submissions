class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(pepole);
        int s=0;
        int e=people.length-1;
        int cnt=0;
        while(s<e){
          int sum=pepole[s]+people[e];
          if(sum<=limit){
            s++;
            e--;
            cnt++;
          }
          else {
            e--;
            cnt++;
          }

        }
        return cnt;
    }
}