class Solution {
    public int minPairSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int max = 0;
        int sum = 0;
        int i = 0;
        int j = n-1;
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        
        while (i <= j) {
         sum= arr[i]+arr[j];
         i++;
         j--;
         max=Math.max(max,sum);
        }
        return max;
    }
}