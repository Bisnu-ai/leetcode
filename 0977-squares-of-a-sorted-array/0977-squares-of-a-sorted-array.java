class Solution {
    public int[] sortedSquares(int[] arr) {
        int[] temp = new int[arr.length];

        int l = 0;
        int r = arr.length - 1;
        int index = arr.length - 1;
        while (l <= r) {
            int ls = arr[l] * arr[l];
            int rs = arr[r] * arr[r];
            if (ls > rs) {
                temp[index] = ls;
                l++;
            } else {
                temp[index] = rs;
                r--;
            }

            index--;

        }
        return temp;
    }
}