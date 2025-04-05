/*
 *              *
 *            * * *
 *          * * * * *
 *        * * * * * * *
 *      * * * * * * * * *
 *    * * * * * * * * * * *
 *  * * * * * * * * * * * * *
 */
import java.io.*;
class starOne{
    public static void main(String[] args)
         throws IOException {
        int m,n,space,k;
        k=1; 
        for(m=1;m<=5;m++){ 
              for(space=5;space>m;space--)
                   System.out.print(" ");
              for(n=1;n<=k;n++)
                System.out.print("*");
            k+=2;
            System.out.print("\n");
        }
    }
}