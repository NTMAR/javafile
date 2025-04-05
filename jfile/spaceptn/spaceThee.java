/*
 * b b b b 5
 * b b b 4 4
 * b b 3 3 3
 * b 2 2 2 2
 * 1 1 1 1 1
 */
import java.io.*;
class spaceThee {
    public static void main(String[] args) {
        int j, i, space;
        for (i = 5; i >= 1; i--) {
            for (space = 1; space < i; space++)
                System.out.print(" ");
            for (j = 5; j >= 1; j--)
                if (i <= j)
                    System.out.print(i);
            System.out.print("\n");
        }
    }
}