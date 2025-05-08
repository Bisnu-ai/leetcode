class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int nzero = 0, nones = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i]== 0) 
                nzero++;
            
            if (nums[i]== 1) 
                nones++;
            
        }
        for (int i = 0; i < n; i++) {
            if (i < nzero) 
                nums[i] = 0;
            else if (i < nzero + nones) 
                nums[i] = 1;

            else 
                nums[i] = 2;
            
        }

       

    
    }

}