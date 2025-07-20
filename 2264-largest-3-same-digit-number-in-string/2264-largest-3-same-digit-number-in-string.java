import java.util.*;
class Solution {
    public String largestGoodInteger(String num) {
        int n=num.length();

        char maxchar =' ';
        for(int i=2;i<n;i++){
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i-2)){
               if(num.charAt(i)>maxchar){
                maxchar=num.charAt(i);
               }
            }
        }
        if(maxchar == ' '){
            return "";
        }
        return ""+maxchar+maxchar+maxchar;
    }
}