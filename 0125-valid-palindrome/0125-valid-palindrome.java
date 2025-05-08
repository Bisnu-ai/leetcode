class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n=s.length();

        if(s==" "){
            return true;
        }else{
        for(int i=0;i<s.length()/2;i++){
         if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
         }else{
          }
        }
      }
            return true;
    }
}