class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i;k <= j; k++) {
                    int ans=j-i+1;
                    if(ans%2!=0){
                        sum+=arr[k];
                    }
                }
            }
        }
        return sum;
    }
}