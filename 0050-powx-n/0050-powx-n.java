class Solution {
    public double myPow(double x, int n) {
        double res=0;
        if(n<0){
            res=1/Math.pow(x,n);
        }
        res=Math.pow(x,n);
        return res;
    }
}