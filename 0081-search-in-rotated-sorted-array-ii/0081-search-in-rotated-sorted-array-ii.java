class Solution {
    public boolean search(int[] arr, int target) {
        int first=0;
        int n= arr.length;
        int end=n-1;
        while(first<=end){
            int mid=first+(end-first)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[first]==arr[mid] && arr[mid]==arr[end]){
                first++;
                end--;
            }else if(arr[first]<=arr[mid]){
                if(arr[first]<=target && target<arr[mid]){
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
        return false;
    }
}