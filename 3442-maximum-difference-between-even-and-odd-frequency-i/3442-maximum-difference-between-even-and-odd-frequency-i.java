class Solution {
    public int maxDifference(String s) {
       int [] temp=new int[26];
       int maximum=0;
       int minimum=s.length();
       for(char c:s.toCharArray()){
        temp[c-'a']++;
       }
       for(int i=0; i<26; i++){
        if(temp[i]%2==0 && temp[i]>0){
            minimum=Math.min(minimum,temp[i]);
        }
        if(temp[i]%2!=0){
            maximum=Math.max(maximum,temp[i]);
        }
       }
       return maximum-minimum;
    }
}