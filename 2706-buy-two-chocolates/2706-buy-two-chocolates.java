import java.util.*;
class Solution {
    public int buyChoco(int[] arr, int money) {
       int min=Integer.MAX_VALUE;
       int secmin=Integer.MAX_VALUE;
       
      for(int ele:arr){
        if(ele<min){
            secmin=min;
            min=ele;
        }else if(ele<secmin){
            secmin=ele;
        }
      }
       
       if(min+secmin>money){
        return money;
       }

        
       
       return money-(min+secmin);
    }
}