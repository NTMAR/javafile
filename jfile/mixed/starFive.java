/*
 *                         *
 *                       * * * 
 *                     * * * * *
 *                   * * * * * * *
 *                 * * * * * * * * *
 *                   * * * * * * *
 *                     * * * * *
 *                       * * * 
 *                         *
 */
import java.io.*;
class starFive{
    public static void main(String[] args) {
        int m,n,k,space;
        k=1;
        for(m=5;m>=1;m--){
            for(space=1;space<m;space++)
                System.out.print("  ");
                for(n=1;n<=k;n++)
                  System.out.print(" "+"*");
                  k+=2;
                  System.out.print("\n");
        }
        k=7;
        for(m=1;m<5;m++){
            for(space=1;space<=m;space++)
               System.out.print("  ");
               for(n=1;n<=k;n++)
                 System.out.print(" "+"*");
                 k-=2;
                 System.out.print("\n");
        }
    }
}
