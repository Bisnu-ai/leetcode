import java.util.*;
class Solution {
    public String reversePrefix(String word, char ch) {
        int j=word.indexOf(ch);
        if(j==-1){
            return word;
        }
        StringBuilder str=new StringBuilder(word.substring(0,j+1));
        str.reverse();
        str.append(word.substring(j+1));
        return str.toString();
    }
}