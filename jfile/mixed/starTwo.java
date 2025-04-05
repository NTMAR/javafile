/*
 *    *
 *    * *
 *    * * *
 *    * * * *
 *    * * * * * * * * *
 *              * * * *
 *                * * *
 *                  * *
 *                    *
 */    
import java.io.*;
class starTwo {
    public static void main(String[] args) {
        int i, m,space, n, k, p;
        k = 5;
        p = 4;
        for (i = 1; i <= 4; i++) {
            for (m = 1; m <= i; m++)
                System.out.print(" "+"*");
            System.out.print("\n");
        }
        for ( i = 1; i <= 9; i++)
            System.out.print(" "+"*");
        System.out.print("\n");
        for (int rows = 1; rows <= 4; rows++) {
            for (space = 1; space <= k; space++)
                System.out.print("  ");
            for (n = p; n >= 1; n--)
                System.out.print(" "+"*");
            p -= 1;
            k += 1;
            System.out.print("\n");
        }
    }
}