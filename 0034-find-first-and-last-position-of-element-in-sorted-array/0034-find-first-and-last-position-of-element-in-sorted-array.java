class Solution {
    public int[] searchRange(int[] arr, int target) {
       boolean isfirst;
       int[]res=new int[2];
      int first=bsearch(arr,target,true);
              
       int last=bsearch(arr,target,false);
       res[0]=first;
       res[1]=last;
       
 return res;
    }
    public static int bsearch(int arr[],int target,boolean isfirst){
          int left = 0;
        
    int right = arr.length - 1;
    int ans=-1;
    while (left <= right) {
      int mid = left +(right-left) / 2;

      if (arr[mid] == target) {
        ans= mid;
        if(isfirst){
          right=mid-1;
        }else{
            left=mid+1;
        }
        
      } else if (target > arr[mid]) {
        left = mid+1; 
      } else {
        right = mid-1;
      }

    }
return ans;
    }
}