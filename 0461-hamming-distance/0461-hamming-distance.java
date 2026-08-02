class Solution {
    public int hammingDistance(int x, int y) {
       
       int res=x^y;
       String r=Integer.toBinaryString(res);
       int count = 0;
       for(int i=0;i<r.length();i++){
        if(r.charAt(i)=='1'){
            count++;
        }
       }
        return count;
    }
}