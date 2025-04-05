/*
 *    * * * * *
 *      * * * *
 *        * * *
 *          * *
 *            *
 */
import java.io.*;
class spaceSixteen {
        public static void main(String[] args) {
            int m,n,space;
            for(m=5;m>=1;m--){
                for(space=5;space>m;space--)
                     System.out.print("  ");
                for(n=1;n<=m;n++)
                     System.out.print(" "+"*");
                System.out.print("\n");
            }
        }
}

