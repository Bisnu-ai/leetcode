class Solution {
    public int majorityElement(int[] arr) {
        //using bubble sort
        int n=arr.length;
        for(int x=0;x<n-1;x++){
            boolean flag=true;
            for(int i=0;i<n-1-x;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag=false;
                }
            }
        if(flag==true)break;
        }
        return arr[n/2];
    }
}