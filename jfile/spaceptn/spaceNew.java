
/*
 * E D C B A     a b c d e
 *   a b c d       a b c d
 *     C B A         a b c
 *       a b           a b
 *         A             a
 */
import java.io.*;
class spaceNew {
  public static void main(String[] args) {
    int i, j, space, k;
    k = 29;
    for (i = 69; i >= 65; i--) {
      if (i == 66)
        k = 31;
      for (space = 69; space > i; space--)
        System.out.print("  ");
      for (j = i; j >= 65; j--) {
        if (i == 68) {
          System.out.print(" " + (char) (j + k));
          k += 2;
        } else if (i == 66) {
          System.out.print(" " + (char) (j + k));
          k += 2;
        } else
          System.out.print(" " + (char) j);
      }
      System.out.print("\n");
    }
  }
}