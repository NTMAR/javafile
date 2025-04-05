
/*
 * A B C D E
 * 1 2 3 4 5
 *   b c d e
 *   2 3 4 5
 *     C D E
 *     3 4 5
 *       d e
 *       4 5
 *         E
 *         5
 */
import java.io.*;

class spaceThree {
    public static void main(String[] args) {
        int a, b, space, i, j;
        a = 65;
        i = 1;
        for (int rows = 1; rows <= 5; rows++) {
            for (space = 65; space < a; space++)
                System.out.print("  ");
            for (b = a; b <= 69; b++)
                if (a == 66)
                    System.out.print(" " + (char) (b + 32));
                else if (a == 68)
                    System.out.print(" " + (char) (b + 32));
                else
                    System.out.print(" " + (char) b);
            System.out.print("\n");
            for (space = 1; space < i; space++)
                    System.out.print("  ");
            for (j = i; j <= 5; j++)
                    System.out.print(" " + j);
            System.out.print("\n");
            i++;
            a++;
        }
    }
}