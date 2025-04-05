
/*
 *       3
 *     5 6
 *   7 8 9  
 */
import java.io.*;
class ArrayPtnFive {
  public static void main(String[] argd) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int arr[][] = new int[3][3];
    int i, j, k = 0;
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++)
        arr[i][j] = k += 1;
    }

    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++)
        if (j >= 2 - i)
          System.out.print(arr[i][j] + " ");
        else
          System.out.print("  ");
      System.out.print("\n");
    }
  }
}