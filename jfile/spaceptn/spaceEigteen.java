/*
 * 1 2 3 4 5
 *   1 2 3 4
 *     1 2 3
 *       1 2
 *         1
 */
import java.io.*;
class spaceEigteen {
        public static void main(String[] args) {
            int m,n,space;
            for(m=5;m>=1;m--){
                for(space=5;space>m;space--)
                     System.out.print("  ");
                for(n=1;n<=m;n++)
                     System.out.print(" "+n);
                System.out.print("\n");
            }
        }
}

