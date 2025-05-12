class Solution {
    public boolean canPlaceFlowers(int[] flower, int n) {
        int k=flower.length;
        if(n==0){
            return true;
          }
        for(int i=0;i<k;i++){
            if(flower[i]==0){
            boolean left=(i==0)||(flower[i-1]==0);
            boolean right=(i==k-1)||(flower[i+1]==0);
            
          if(left && right){
            flower[i]=1;
            n--;
          }
          if(n==0)
            return true;
            }
          
        }
        return false;
    }
}