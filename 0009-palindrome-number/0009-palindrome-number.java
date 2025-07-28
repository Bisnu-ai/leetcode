class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int temp=x;
        if(temp<0){
           return false;
        }else{

        while(temp!=0){
            int d=temp%10;
            reverse=reverse*10+d;
            temp/=10;
        }
        if(x!=reverse){
            return false;
           }
        }
        return true;
    }
}