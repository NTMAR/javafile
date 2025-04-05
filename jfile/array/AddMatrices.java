import java.io.*;

class AddMatrices {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int i, j, k;
    int A[][] = new int[3][3];
    int B[][] = new int[3][3];
    k = 0;
    System.out.println("\t\t\tEnter 9 Elements for 1st array");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        System.out.print("Enter " + (k += 1) + " element=");
        A[i][j] = Integer.parseInt(br.readLine());
      }
    }
    k = 0;
    System.out.println("\t\t\tEnter 9 Elements for 2nd array.");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        System.out.print("Enter " + (k += 1) + " element=");
        B[i][j] = Integer.parseInt(br.readLine());
      }
    }
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++)
        System.out.print(A[i][j] + " ");
      if (i == 1)
        System.out.print("+" + " ");
      else
        System.out.print("  ");
      for (j = 0; j < 3; j++)
        System.out.print(B[i][j] + " ");
      if (i == 1)
        System.out.print("=" + " ");
      else
        System.out.print("  ");
      for (j = 0; j < 3; j++)
        System.out.print(A[i][j] + B[i][j] + " ");
      System.out.print("\n");
    }
  }
}
