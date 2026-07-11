class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int s=0;
        int e=people.length-1;
        int cnt=0;
        while(s<=e){
          int sum=people[s]+people[e];
 if(s==e) sum=sum/2;
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