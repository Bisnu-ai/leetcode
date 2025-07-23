import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count=new int[26];
    for(char ch:s.toCharArray()){
        count[ch-'a']++;
    }
    for(char ch:t.toCharArray()){
        count[ch-'a']--;
    }
   //instead of for alse use lambda 
for(int a:count){
    if(a!=0){ //if all element is zero in the count array then its anagram
        return false;
    }
}
return true;

    }
}