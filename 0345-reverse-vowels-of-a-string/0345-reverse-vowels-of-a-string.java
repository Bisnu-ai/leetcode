class Solution {
    public static boolean check(char s) {
        s = Character.toUpperCase(s);
        if (s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U') {
            return true;
        }
        return false;
    }

    public String reverseVowels(String str) {
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (!check(arr[j])) {

                j--;
                
            } else if (!check(arr[i])) {
                i++;
            } else {
                 char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
        return new String(arr);
    }
}