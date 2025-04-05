/*
 * b b b b 1
 * b b b 2 1
 * b b 3 2 1
 * b 4 3 2 1 
 * 5 4 3 2 1
 */
import java.io.*;
class blankSix {
    public static void main(String[] args) {
        int j, i, blank;
        for (i = 1; i <= 5; i++) {
            for (blank = 4; blank >= i; blank--)
                System.out.print(" ");
            for (j = i; j >= 1; j--)
                    System.out.print(j);
            System.out.print("\n");
        }
    }
}
