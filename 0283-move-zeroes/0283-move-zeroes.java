class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){

            zero++;
            }
        }
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[idx++] = arr[i];
            }
        }
      
        for(int i=0;i<zero;i++){
            arr[idx++]=0;
        }

    }
}