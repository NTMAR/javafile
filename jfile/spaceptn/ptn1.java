/*
 * b b b b 1
 * b b b 2 2
 * b b 3 3 3
 * b 4 4 4 4
 * 5 5 5 5 5
 */
import java.io.*;
 class ptn1 {
    public static void main(String[] args) {
        int j, i, space;
        for (i = 1; i <= 5; i++) {
            for (space = 4; space >= i; space--)
                if (space > i)
                    System.out.print(" ");
            for (j = 1; j <= 5; j++)
                if (j <= i)
                    System.out.print(i);
            System.out.print("\n");
        }
    }
}