/*
 *         A
 *       A B
 *     A B C
 *   A B C D
 * A B C D E
 */
import java.io.*;
class spaceFourteen {
        public static void main(String[] args) {
            int m,n,space;
            for(m=65;m<=69;m++){
                for(space=69;space>=m;space--)
                     System.out.print(" ");
                for(n=65;n<=m;n++)
                     System.out.print((char)n);
                System.out.print("\n");
            }
        }
}

