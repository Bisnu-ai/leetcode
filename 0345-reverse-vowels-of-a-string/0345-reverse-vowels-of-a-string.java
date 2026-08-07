class Solution {
    public boolean check(char s) {
        char c = Character.toLowerCase(s);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] chars = s.toCharArray();
        while (i < j) {
            if (check(chars[i]) && check(chars[j])) {
                char temp=chars[i];
                chars[i]=chars[j];
                chars[j]=temp;
                i++;
                j--;
            } else if (check(chars[i]) && !check(chars[j]) ) {
              j--;
            }else{
                i++;
            }
        }
        return new String (chars);
    }
}