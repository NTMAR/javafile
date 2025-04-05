/*
 * b b b b 5
 * b b b 4 5
 * b b 3 4 5 
 * b 2 3 4 5
 * 1 2 3 4 5
 */
import java.io.*;
class blankSe {
    public static void main(String[] args) {
        int j, i, blank;
        for (i = 5; i >= 1; i--) {
            for (blank = 1; blank < i; blank++)
                System.out.print(" ");
            for (j = i; j <= 5; j++)
                    System.out.print(j);
            System.out.print("\n");
        }
    }
}

