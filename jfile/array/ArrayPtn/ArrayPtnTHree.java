
/*
 *     1
 *     4 5
 *     7 8 9
 *
 */
import java.io.*;

class ArrayPtnTHree {
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
        if (j <= i)
          System.out.print(arr[i][j] + " ");
        else
          System.out.print("  ");
      System.out.print("\n");
    }
  }
}