/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
int len = mountainArr.length();
  int idx=getPeekEle(mountainArr,len);
  System.out.println(idx);
int ans=binarySearch(mountainArr,0,idx,target,false);
 return  ans==-1?binarySearch(mountainArr,idx+1,len-1,target,true):ans;
    }

    public static int getPeekEle(MountainArray mountainArr,int len) {
      
        if (mountainArr.get(0) > mountainArr.get(1))
            return 0;
        if (mountainArr.get(len - 2) < mountainArr.get(len - 1))
            return len - 1;

        int s = 0;
        int e = len - 1;
        while (s <=e) {
            int mid = s + (e - s) / 2;
            int midval = mountainArr.get(mid);
            int lowval = mountainArr.get(mid - 1);
            int highval = mountainArr.get(mid + 1);

            if (midval > lowval && midval > highval)
                return mid;
            else if (midval > lowval)
                s = mid + 1;
            else
                e = mid - 1;
        }
        return -1;
    }

public static int binarySearch(MountainArray mountainArr,int s,int e ,int target,boolean desc){

while(s<=e){
    int mid=s+(e-s)/2;
    int midval=mountainArr.get(mid);
    if(midval==target) return mid;

   if(!desc){
      if(midval>target)e=mid-1;

    else s=mid+1;
   }
   else{

      if(midval>target)s=mid+1;

    else e=mid-1;
   }

}
return -1;

    }
}