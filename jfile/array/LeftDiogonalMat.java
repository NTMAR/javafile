import java.io.*;

class LeftDiogonalMat {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int i, j, k = 0;
    int arr[][] = new int[3][3];
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        System.out.println("Enter " + (k += 1) + " element=");
        arr[i][j] = Integer.parseInt(br.readLine());
      }
    }
    System.out.println("Your Matrix is");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++)
        System.out.print(arr[i][j] + " ");
      System.out.print("\n");
    }
    System.out.println("Left Diogonal of Matrix");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++)
        if (i == j)
          System.out.print(arr[i][j]);
        else
          System.out.print(" ");
      System.out.print("\n");
    }
  }
}