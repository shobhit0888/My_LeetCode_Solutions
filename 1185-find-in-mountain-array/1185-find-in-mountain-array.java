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
      int l1=mountainArr.length();
      int l=0,r=l1-1;
      int index=0;
      int mid=0;
      while(l<=r){
          mid=l+(r-l)/2;
          int b=mountainArr.get(mid);
          int a=mid==0?-1:mountainArr.get(mid-1);
          int c=mid==l1-1?-1:mountainArr.get(mid+1);
          if(b-a>=0&&b-c>=0){
              
              index=mid;
              break;
          }
          else if(b-a>=0&&b-c<=0){
              l=mid+1;
          }
          else{
              r=mid-1;
          }
      }
      System.out.println(index);
      l=0;
      r=index;
       while(l<=r){

           mid=l+(r-l)/2;
           int b=mountainArr.get(mid);
           if(target==b)
           return mid;
           else if(target<b)
           r=mid-1;
           else
           l=mid+1;
       }
       l=index;
       r=l1-1;
       while(l<=r){

           mid=l+(r-l)/2;
           int b=mountainArr.get(mid);
           if(target==b)
           return mid;
           else if(target<b)
            l=mid+1;
           else
           r=mid-1;
       }
       return -1;
    }
}