class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length) return findMedianSortedArrays(nums2,nums1);
         int m = nums1.length + nums2.length;
        int mid = (m + 1) / 2;
        int s=-1;
        int e=nums1.length-1;
        while(s<=e){
   int mid1 = s + (e - s) / 2;
            int mid2 = mid - mid1 - 2;
          int la=Integer.MIN_VALUE;
          int ra=Integer.MAX_VALUE;
          int lb=Integer.MIN_VALUE;
          int rb=Integer.MAX_VALUE;
          if(mid1>=0) la=nums1[mid1];
          if(mid1+1<nums1.length) ra=nums1[mid1+1];
          if(mid2>=0) lb=nums2[mid2];
          if(mid2+1<nums2.length) rb=nums2[mid2+1];

          if(la<=rb&&lb<=ra) {
            if(m%2==1){
                return Math.max(la,lb);
            }
            else {
                return (Math.max(la,lb)+Math.min(ra,rb))/2.000;
            }
          }
          else if(la>rb)e=mid1-1;
          else s=mid1+1;


        }
        return -1;
    }
}
