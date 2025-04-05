 /*
  *         1   3
  *           5
  *         7   9
  */ 
import java.io.*;
class ArrayPtnOne {
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
        if (i == j || i + j == 2)
          System.out.print(arr[i][j] + " ");
        else
          System.out.print("  ");
      System.out.print("\n");
    }
  }
}