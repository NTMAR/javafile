
/*
 *     1 2 3
 *     4 5
 *     7
 */
import java.io.*;

class ArrayPtnFour {
  public static void main(String[] argd) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int arr[][] = new int[3][3];
    int i, j, k = 0;
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++)
        arr[i][j] = k += 1;
    }
    k = 3;
    for (i = 0; i < 3; i++) {
      for (j = 0; j < k; j++)
        System.out.print(arr[i][j] + " ");
      k -= 1;
      System.out.print("\n");
    }
  }
}