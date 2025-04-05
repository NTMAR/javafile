import java.io.*;

class TwoDArray {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int i, j, k = 0;
    int arr[][] = new int[3][3];
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        System.out.print("Enter " + (k += 1) + " element=");
        arr[i][j] = Integer.parseInt(br.readLine());
      }
    }
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++)
        System.out.print(arr[i][j] + " ");
      System.out.print("\n");
    }
  }
}