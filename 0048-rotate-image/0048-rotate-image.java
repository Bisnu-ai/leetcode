class Solution {
    private void transpose(int[][] matrix){
 int m=matrix.length;
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
           int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }
    }
     private void reverseRows(int[][] matrix){
        int m= matrix.length;
 for(int i=0;i<m;i++){
            int start=0;
            int end=matrix.length-1;
            while(start<end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
 }
     }
    public void rotate(int[][] matrix) {
       transpose(matrix);
       reverseRows(matrix);
        


    }

}