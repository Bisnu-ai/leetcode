class Solution {
    public boolean isThree(int n) {
      
        int flag = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                flag++;
            }
        }
        return flag==3;
    }
}