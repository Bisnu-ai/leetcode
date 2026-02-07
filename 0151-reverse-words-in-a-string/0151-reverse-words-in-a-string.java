class Solution {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) {
                break;
            }
            int e = i;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            if (sb.isEmpty()) {
                sb.append(s.substring(i + 1, e + 1));
            } else {
                sb.append(' ');
                sb.append(s.substring(i + 1, e + 1));
            }

        }

        return sb.toString();

    }
}