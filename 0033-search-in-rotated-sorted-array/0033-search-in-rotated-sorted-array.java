class Solution {
    public int search(int[] nums, int target) {
      
    //=============O(n) soln==========

    //  HashMap<Integer,Integer> hm=new HashMap<>();

    //  for(int i=0;i<nums.length;i++){
    //     hm.put(i,nums[i]);
    //      if(hm.get(i)==target){
    //         return i;
    //     }
    //  }
     

//=========O(logn)===============
        int i=0;
        int j=nums.length-1;
        int res=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                i=mid+1;
                res= mid;
            }else if(nums[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
         
         i=0;
         j=nums.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                return mid;
            }
             if(nums[mid]>=nums[i]){
                if(nums[i]<=target && target<nums[mid]){
                 j=mid-1;
                }else{
                    i=mid+1;
                }
            }else{
                if(nums[mid]<target && target<=nums[j]){
                 i=mid+1;
                }else{
                    j=mid-1;
                }
               
            }
        }
         
      
         
        
        return res;
    }
}