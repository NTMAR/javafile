/*
 *                  * * * * *
 *                  * * * *
 *                  * * *
 *                  * *
 *                  *
 *          * * * * *
 *            * * * *
 *              * * *
 *                * *
 *                  *
 */
import java.io.*;
class starFour {
    public static void main(String[] args) {
        int m, space, p, k;
        for (m = 5; m >= 1; m--) {
            for (space = 1; space <= 4; space++)
                System.out.print("  ");
            for (p = 1; p <= m; p++)
                     System.out.print(" "+"*");
                System.out.print("\n");
        }
        for (m = 5; m >= 1; m--) {
            for (space = 5; space > m; space--)
                System.out.print("  ");
                for(p=1;p<=m;p++)
                   System.out.print(" "+"*");
            System.out.print("\n");
        }
    }
}