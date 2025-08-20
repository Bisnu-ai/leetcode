class Solution {
    public int missingNumber(int[] arr) {
        int arrsum=0;
       int n=arr.length;
        int totalsum=n*(n+1)/2;
     
        for(int e:arr){
          arrsum+=e;
        }
        return totalsum-arrsum;


    }
}