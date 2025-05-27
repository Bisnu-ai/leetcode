class Solution {
    public int compress(char[] str) {
        int len = 0;
        for (int i = 0; i < str.length;) {
            char ch = str[i];
            int count = 0;

            while (i < str.length && str[i] == ch) {
                count++;
                i++;
            }

            str[len++] = ch;

            if (count > 1) {
                String newstr = Integer.toString(count);
                for (int j = 0; j < newstr.length(); j++) {
                    str[len++] = newstr.charAt(j);
                }
            }
        }
        return len;
    }
}
