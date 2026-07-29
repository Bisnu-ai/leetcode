class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> str = new HashSet<>();
        int m = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            while (str.contains(s.charAt(i))){

                
                    str.remove(s.charAt(l));
                
                l++;

            }
            str.add(s.charAt(i));

            if(str.size()>m){
                m=str.size();
            }
        }
        return m;
    }
}