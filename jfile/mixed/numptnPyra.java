/*
 *                         1
 *                       1 2 1
 *                     1 2 3 2 1
 *                   1 2 3 4 3 2 1
 *                 1 2 3 4 5 4 3 2 1
 */
import java.io.*;
class numptnPyra {
    public static void main(String[] args)
            throws IOException {
        int m, n, j, space;
        for (m = 1; m <= 5; m++) {
            for (space = m; space < 5; space++)
                System.out.print("  ");
            for (n = 1; n <= m; n++)
                System.out.print(" " + n);
            for (j = m - 1; j >= 1; j--)
                System.out.print(" " + j);

            System.out.print("\n");
        }
    }
}