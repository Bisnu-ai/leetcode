class Solution {
    public int[] searchRange(int[] arr, int target) {
        int i=0;
        int j=arr.length-1;
        int f=-1;
        int l=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                f=mid;
                j=mid-1;
            }else if(arr[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        i=0;
        j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                l=mid;
                i=mid+1;
            }else if(arr[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return new int[]{f,l};
    }
}