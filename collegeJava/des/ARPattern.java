import java.io.*;

class ARPattern {
  public static void main(String[] argd) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char arr[][] = new char[10][10];
    int i, j;
    for (i = 0; i < 10; i++) {
      for (j = 0; j < 10; j++)
        arr[i][j] = '*';
    }
    for (i = 0; i < 10; i++) {
      for (j = 0; j < 10; j++)
        if (i == 0 || j == 0 || j == 9 || j == 8 - i + 1 || i == 9 || i == j)
          System.out.print(arr[i][j] + " ");
        else
          System.out.print("  ");
      System.out.print("\n");
    }
  }
}