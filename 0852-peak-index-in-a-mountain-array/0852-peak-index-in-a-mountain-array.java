class Solution {
    
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
            //   int peak=0;
              int n=arr.length;
        int end=n-1;
        while(start<=end){
              int mid=start+(end-start)/2;
              if(mid!=0 && mid!=n-1 && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){ //for all mountain means inc and dec
                 return mid;
              }else if(mid!=n-1 && arr[mid]<arr[mid+1]){ //for inc first half
                start=mid+1;
              }else{
                end=mid-1;//for decreasing half
              }
        }
        return -1;
    }
}