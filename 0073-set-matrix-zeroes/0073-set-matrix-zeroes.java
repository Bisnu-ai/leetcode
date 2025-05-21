class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n= matrix[0].length;
        boolean rowimpacted=false;
        boolean colimpacted=false;
        //for check for row
        for(int col=0;col<n;col++ ){
            if(matrix[0][col]==0){
                rowimpacted=true;
                break;
            }
        }
        //for check for col
        for(int row=0;row<m;row++ ){
            if(matrix[row][0]==0){
                colimpacted=true;
                break;

            }
        }

        //markers
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    
                    matrix[i][0]=0;
                    matrix[0][j]=0;


                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;

                }
            }
        }
        for(int i=0;i<m;i++){
            if(colimpacted){
                matrix[i][0]=0;
            }
        }
        for(int j=0;j<n;j++){
            if(rowimpacted){
                matrix[0][j]=0;
            }
        }


    }
}