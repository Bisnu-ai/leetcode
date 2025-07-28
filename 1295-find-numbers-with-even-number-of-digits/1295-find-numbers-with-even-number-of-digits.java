class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
        int dcount=0;
            while(temp!=0){
            dcount++;
            temp/=10;
            }
            if(dcount%2==0){
                count++;
            }
        }
        return count;
    }
}