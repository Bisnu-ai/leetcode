import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> result=new ArrayList<>();
        
        int dir=0;
        int top = 0, down = m - 1;
        int left = 0, right = n - 1;
        while(top <= down && left <= right){
            if(dir==0){

            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
              top++;
            }
           else if(dir==1){

            for(int i=top;i<=down;i++){
                result.add(matrix[i][right]);
            }
              right--;
            }
           else if(dir==2){

            for(int i=right;i>=left;i--){
                result.add(matrix[down][i]);
            }
              down--;
            }
           else if(dir==3){

            for(int i=down;i>=top;i--){
                result.add(matrix[i][left]);
            }
              left++;
            }
            dir=(dir+1)%4;
            
            
        }
    return result;
    }
}