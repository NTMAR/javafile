import java.io.*;

class NMethodPat {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n, space, i, j, rows, colm, value, p;
    System.out.print("Enter number to print series:");
    n = Integer.parseInt(br.readLine());
    colm = n / 10;
    rows = 9 + colm - 10;
    i = 1;
    while (i <= 10) {
      value = i;
      j = 1;
      while (j <= colm) {
        System.out.print(value + "\t");
        value += 9;
        if (i == j)
          break;
        j++;
      }
      System.out.println();
      i++;
    }
    p = i;
    i = 1;
    while (i <= rows) {
      value = p;
      space = 1;
      while (space <= i) {
        System.out.print("\t");
        value += 9;
        space++;
      }

      j = space;
      while (j <= colm) {
        System.out.print(value + "\t");
        value += 9;
        j++;
      }
      System.out.print("\n");
      i++;
      p++;
    }
  }
}
