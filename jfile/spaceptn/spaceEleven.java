/*
 *         A 
 *         1
 *       A B
 *       1 2
 *     A B C
 *     1 2 3
 *   A B C D
 *   1 2 3 4
 * A B C D E
 * 1 2 3 4 5
 */
import java.io.*;
class spaceEleven {
    public static void main(String[] args) {
        int m, n, a, b, space, rows;
        m = 65;
        a = 1;
        for (rows = 1; rows <= 5; rows++) {
            for (space = 69; space > m; space--)
                System.out.print("  ");
            for (n = 65; n <= m; n++)
                System.out.print(" " + (char) n);
            System.out.print("\n");
            m = n;
            for (space = 4; space >= a; space--)
                System.out.print("  ");
            for (b = 1; b <= a; b++)
                System.out.print(" " + b);
            System.out.print("\n");
            a = b;
        }

    }
}