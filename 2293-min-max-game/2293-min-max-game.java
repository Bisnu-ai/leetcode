class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        while(n!=1){
          int[] arr=new int[n/2];
          int i=0;
          while(i<n/2){
            if(i%2==0 && i<n/2){
                arr[i]=Math.min(nums[2 * i], nums[2 * i + 1]); 
            }else if(i%2!=0 && i<n/2){
                arr[i]=Math.max(nums[2 * i], nums[2 * i + 1]); 
            }
            
            i++;

             
          } 
            nums=arr;

          n/=2;

        }
        int ans=nums[0];
        return ans;
    }
}