/*
 * b b b b 5 
 * b b b 5 4
 * b b 5 4 3
 * b 5 4 3 2
 * 5 4 3 2 1
 */
import java.io.*;
class spaceEi {
    public static void main(String[] args) {
        int j, i, blank;
        for (i = 5; i >= 1; i--) {
            for (blank = 1; blank < i; blank++)
                System.out.print(" ");
            for (j = 5; j >= i; j--)
                    System.out.print(j);
            System.out.print("\n");
        }
    }
}
