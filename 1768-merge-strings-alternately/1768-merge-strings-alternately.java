class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l = word1.length();
        int r = word2.length();
        int i = 0;
        int j = 0;
        String result = "";

        while (i < l || j < r) {
            
                if (i < l) {

                    result += word1.charAt(i);
                    
                }
            
                if (j < r) {

                    result += word2.charAt(j);
                  
                }

            
            i++;
            j++;

        }
        return result;
    }
}