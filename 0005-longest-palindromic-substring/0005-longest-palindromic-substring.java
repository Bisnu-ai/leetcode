class Solution {
    public static boolean palin(String str) {
        int i = 0;
        int j = str.length() - 1;
        boolean res = true;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                res = false;
                break;
            }
                i++;
                j--;
        }
        return res;
    }

    public String longestPalindrome(String s) {
        if(palin(s)){
            return s;
        }

        
        StringBuilder sc = new StringBuilder();
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j + i <= s.length(); j++) {
                // len = s.substring(j, j + i).toString().length();
                len=i+1;
                if (palin(s.substring(j, j + i))) {
                    if (sc.length() < len) {
                        sc.setLength(0);
                        sc.append(s.substring(j, j + i));
                    }
                }
            }
        }
        return sc.toString();
    }
}