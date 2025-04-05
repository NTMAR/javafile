
/*       2 0 0
 *       0 2 0
 *       0 0 2
 *///Scaler matrix means Diagonal of matrix are same value it means a constant and non diogonal are zero '0';
import java.io.*;
class ScalerMatrix {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int rows, colm, i, j, k, y = 0, count = 0;
      int arr[][];
      System.out.println("Enter no. of rows");
      rows = Integer.parseInt(br.readLine());
      System.out.println("Enter no. of colmns");
      colm = Integer.parseInt(br.readLine());
      arr = new int[rows][colm];
      for (i = 0; i < rows; i++) {
         for (j = 0; j < colm; j++) {
            System.out.print("Enter " + "value for " + i + "" + j + " index=");
            arr[i][j] = Integer.parseInt(br.readLine());
         }
      }
      System.out.println("Your matrix is");
      for (i = 0; i < rows; i++) {
         for (j = 0; j < colm; j++)
            System.out.print(arr[i][j] + " ");
         System.out.print("\n");
      }
      if (rows == colm) {
         k = 0;
         k = arr[0][0];
         for (i = 0; i < rows; i++) {
            for (j = 0; j < rows; j++)
               if (i == j)
                  if (k == arr[i][j])
                     count += 1;
         }
         for (i = 0; i < rows; i++) {
            for (j = 0; j < colm; j++)
               if (i != j)
                  if (arr[i][j] == 0)
                     y++;

         }
         if (count == rows && y == rows * colm - rows)
            System.out.println("It is Scaler");
         else
            System.out.println("It is Not Scaler");
      } else
         System.out.println("Rows and colmns are not equal,so it cannot be Scaler matrix");

   }
}