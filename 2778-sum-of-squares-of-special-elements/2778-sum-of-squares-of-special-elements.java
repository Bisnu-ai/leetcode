class Solution {
    public int sumOfSquares(int[] arr) {
        int n = arr.length;
        int total = 0;

        for (int i = 0; i < n; i++) {   
            if (n % (i+1) == 0) {
                total += arr[i] * arr[i];
            }
        }
        return total;
    }
}
