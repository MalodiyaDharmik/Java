public class MultiplyMatrices {
   public static void main(String[] args) {
      int matrix_size = 3;
      int[][] input_matrix_1 = {
         {1, 1, 1},
         {1, 1, 1},
         {1, 1, 1}
      };
     
      int[][] input_matrix_2 = {
         {1, 1, 1},
         {1, 1, 1},
         {1, 1, 1}
      };
      
   int[][] resultant_matrix = new int[matrix_size][matrix_size];
   for(int i = 0; i < matrix_size; i++) {
      for (int j = 0; j < matrix_size; j++) {
         for (int k = 0; k < matrix_size; k++) {
            resultant_matrix[i][j] += input_matrix_1[i][k] * input_matrix_2[k][j];
         }
      }
   }
   System.out.println("\n The product of two matrices is: ");
   for(int i=0;i<matrix_size;i++){
      for(int j=0;j<matrix_size;j++){
         System.out.print( resultant_matrix[i][j]);
      }
      System.out.println("");
   }
   }
}