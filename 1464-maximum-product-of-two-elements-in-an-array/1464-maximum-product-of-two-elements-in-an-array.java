class Solution {
    public int maxProduct(int[] nums) {
        int largest=0;
        int seclargest=0;
        for(int ele:nums){
            if(ele>largest){
                seclargest=largest;
                largest=ele;
            }else if(seclargest<ele){
                seclargest=ele;
            }
        }
        int result=(seclargest-1)*(largest-1);
        return result;
    }
}