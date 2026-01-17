class Solution {
    public int numSubseq(int[] arr, int target) {
        Arrays.sort(arr);
        int m=1_000_000_007;
        int i = 0;
        int j = arr.length - 1;
        long count = 0;
        int[] pre=new int[arr.length];
        pre[0]=1;
        for(int k=1;k<arr.length;k++){
            pre[k]=(pre[k-1]*2)%m;
        }
        while (i <= j) {
           
            if (arr[i] + arr[j] <= target) {
                count =(count+pre[j-i])%m;
                i++;
            } else {
                j--;
            }

        }

        return (int)count;
    }
}