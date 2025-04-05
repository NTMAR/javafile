import java.io.*;

class UserDefinedSize {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int rows, colm, i, j, k = 0;
    int arr[][];
    System.out.println("Enter no. of rows");
    rows = Integer.parseInt(br.readLine());
    System.out.println("Enter no. of colmns");
    colm = Integer.parseInt(br.readLine());
    arr = new int[rows][colm];
    for (i = 0; i < rows; i++) {
      for (j = 0; j < colm; j++) {
        System.out.print("Enter " + (k += 1) + " element=");
        arr[i][j] = Integer.parseInt(br.readLine());
      }
    }
    System.out.println("Your matrix is");
    for (i = 0; i < rows; i++) {
      for (j = 0; j < colm; j++)
        System.out.print(arr[i][j] + " ");
      System.out.print("\n");
    }
  }
}