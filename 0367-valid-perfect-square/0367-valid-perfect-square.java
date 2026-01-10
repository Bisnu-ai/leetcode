class Solution {
    public boolean isPerfectSquare(int num) {
      double root=Math.sqrt(num);
      int r=(int)root;
      if(r*r!=num){
        return false;
      }
        return true;
    

    }
}