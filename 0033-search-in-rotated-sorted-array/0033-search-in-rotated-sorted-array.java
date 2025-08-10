class Solution {
    public int search(int[] arr, int target) {
        int n= arr.length;
        
        int first=0;
        int end=n-1;
       
           while(first<=end){

            int mid=first+(end-first)/2;
              if(target==arr[mid]){
                  return mid;
              }
               if(arr[0]<=arr[mid]){
              if(target<arr[mid] && target>=arr[0]){
                end=mid-1;
              }else{
                first=mid+1;
              }
           
        }else{
           
            if(target>arr[mid] && target<=arr[end]){
                first=mid+1;
              }else{
                end=mid-1;
              }
           }
        }

         return -1;  
       
    }
}