/*
 *                         A
 *                       A B A
 *                     A B C B A
 *                   A B C D C B A
 *                 A B C D E D C B A
 */
import java.io.*;
class alphaPtnPray{
    public static void main(String[] args)
            throws IOException {
        int m, n, j, space;
        for (m = 65; m <= 90; m++) {
            for (space = m; space < 90; space++)
                System.out.print("  ");
            for (n = 65; n <= m; n++)
                System.out.print(" " + (char)n);
            for (j = m - 1; j >= 65; j--)
                System.out.print(" " + (char)j);

            System.out.print("\n");
        }
    }
}