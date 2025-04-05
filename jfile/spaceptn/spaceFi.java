/*  _ _ _ _ _
 * | | | | |1| 
 * | | | |1|2|
 * | | |1|2|3|
 * | |1|2|3|4|
 * |1|2|3|4|5|
 */ 
import java.io.*;
class spaceFi {
    public static void main(String[] args) {
        int j, i, blank;
        for (i = 1; i <= 5; i++) {
            for (blank = 4; blank >= i; blank--)
                System.out.print(" ");
            for (j = 1; j <= i; j++)
                    System.out.print(j);
            System.out.print("\n");
        }
    }
}
