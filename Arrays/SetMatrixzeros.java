//91.62%
public class Solution {
    public void setZeroes(int[][] matrix) {
        final int m = matrix.length;//总行数
        final int n = matrix[0].length;//总列数
        boolean row_has_zero = false;
        boolean col_has_zero = false;
        int i,j;
        
        for(i = 0; i < m; ++i){
          if(matrix[i][0] == 0){
              col_has_zero = true;
              break;
                }
        }
        for(j = 0; j < n; ++j){
            if(matrix[0][j] == 0){
                row_has_zero = true;
                break;
            }
        }
       
        for(i = 1; i < m; ++i){
            for(j = 1; j < n; ++j ){
             if(matrix[i][j] == 0){
                 matrix[0][j]=matrix[i][0] = 0;
                 
             }
         } 
        }
        
     /* for(int i = 1; i < m; ++i)
         for(int j = 1; j < n; ++j )
         if(matrix[i][0] == 0||matrix[0][j] == 0)
            matrix[i][j] = 0;*/
            for (i = 1; i < m; ++i) {
            if (matrix[i][0] != 0) {
                continue;
            }
            for (j = 1; j < n; ++j) {
                matrix[i][j] = 0;
            }
        }
        for (j = 1; j < n; ++j) {
            if (matrix[0][j] != 0) {
                continue;
            }
            for (i = 1; i < m; ++i) {
                matrix[i][j] = 0;
            }
       }
            
      if(row_has_zero){
          for(j = 0; j < n; ++j){
              matrix[0][j] = 0;
          }
      }
      
      if(col_has_zero){
          for(i = 0; i < m; ++i){
              matrix[i][0] = 0;
        }
      }
      
        
        
    }
}