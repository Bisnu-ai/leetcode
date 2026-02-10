class Solution {
    public int findPeakElement(int[] arr) {
        if(arr.length==1){
            return 0;
        }
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    ans= i;
                }
            }
            else if (i == arr.length - 1) {
                if (arr[i - 1] < arr[i]) {
                    ans= i;
                }

            }else{
                if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                    ans= i;
                }
            }


        }
        return ans;
    }
}