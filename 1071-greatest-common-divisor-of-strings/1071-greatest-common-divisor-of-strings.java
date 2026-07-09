class Solution {
    public static int check(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals((str2+str1))){
            return "";
        }
        int len1 = str1.length();
        int len2 = str2.length();
        int g = check(len1, len2);
        String ans="";
        for (int i = 0; i < g; i++) {
            ans+=str1.charAt(i);
        }
        return ans;
    }
}