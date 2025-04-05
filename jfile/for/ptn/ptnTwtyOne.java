/*
 * A B C D E
 * b c d e
 * A B C 
 * d e
 * A
 */
import java.io.*;
class ptnTwtyOne {
    public static void main(String[] args) {
        int i, j;
        for (i = 69; i >= 65; i--) {
            for (j = 65; j <= i; j++) {
                if (i == 68) 
                    System.out.print(" "+(char)(j + 33));
                 else if (i == 66) 
                    System.out.print(" "+(char)(j + 35));
                 else
                    System.out.print(" "+(char) j);
            }
            System.out.print("\n");
        }
    }
}
