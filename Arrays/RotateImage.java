public class Solution {

    public void rotate(int[][] matrix) {

        

        if (matrix == null || matrix.length == 0) return;

        final int n=matrix.length;

        for(int i=0;i<n;++i)

           for(int j=i;j<matrix[0].length;++j){//先转置

              swap(matrix,i,j,j,i);

              

           }

        for(int j=0;j<n;++j)

           for(int i=0;i<n/2;++i){//再沿垂直中线翻转

               swap(matrix,j,i,j,n-1-i);

              

           } 

           

        

    }



    private static void swap(final int[][] nums, int i, int j, int p, int q){

        int temp=nums[i][j];

        nums[i][j]=nums[p][q];

        nums[p][q]=temp;

    }

}
