class Solution {
    public char findTheDifference(String s, String t) {

        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        char res=0;
       for(char c:ss){
         res^=c;
       }
       for(char c:tt){
         res^=c;
       }
       return res;
    }
}