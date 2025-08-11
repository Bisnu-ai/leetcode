class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        int start=0;
        int end=n-1;
        int mine=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[start]<=arr[mid]){
              mine=Math.min(mine,arr[start]);
              start=mid+1;
            }else{
                mine=Math.min(mine,arr[mid]);
                end=mid-1;
            }
        }
        return mine;
    }
}