/*
 * 5 5 5 5 5
 *   4 4 4 4
 *     3 3 3
 *       2 2 
 *         1
 */
import java.io.*;
class spaceSevnteen {
        public static void main(String[] args) {
            int m,n,space;
            for(m=5;m>=1;m--){
                for(space=5;space>m;space--)
                     System.out.print("  ");
                for(n=1;n<=m;n++)
                     System.out.print(" "+m);
                System.out.print("\n");
            }
        }
}

