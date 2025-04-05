/*
 *        *               *
 *        * *           * *
 *        * * *       * * *
 *        * * * *   * * * *
 *        * * * * * * * * *
 */
import java.io.*;
class starThree {
  public static void main(String[] args) {
    int m, n, space, k;
    k = 37;
    for (m = 1; m <= 19; m++) {
      for (n = 1; n <= m; n++)
        System.out.print("*");
      for (space = k; space >= 1; space--)
        System.out.print(" ");
      for (n = 1; n <= m; n++)
        System.out.print("*");
      k -= 2;
      System.out.print("\n");
    }
    for (m = 1; m <= 39; m++)
      System.out.print("*");
  }
}
/*
 * k=7
 * m=1;m<=4;m++
 * last mein m=9
 * for obove figure
 */