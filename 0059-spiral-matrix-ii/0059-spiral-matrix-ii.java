class Solution {
    public int[][] generateMatrix(int n) {
      
        
        int arr[][]=new int[n][n];
        int val=1;
        int dir = 0;
        int top = 0;
        int down = n - 1;
        int left = 0;
        int right = n - 1;
        while (top <= down && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    arr[top][i]=val;
                    val++;
                }
                top++;
            }
            if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    arr[i][right]=val;
                    val++;
                }
                right--;
            }
            if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    arr[down][i]=val;
                    val++;
                }
                down--;
            }
            if (dir == 3) {
                for (int i = down; i >= top; i--) {
                    arr[i][left]=val;
                    val++;
                }
                left++;
            }
            dir++;
            if (dir == 4) {
                dir = 0;
            }
        }
        return arr;
    }
}