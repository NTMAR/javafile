/*
 *     * * * * *
 *     *       *
 *     *       *
 *     *       *
 *     * * * * *      
 */
import java.io.*;
class starSixM{
    public static void main(String[] args) {
        int rows,colmn;
        for(rows=1;rows<=5;rows++)
        {
            for(colmn=1;colmn<=5;colmn++)
            {
               if(rows==1 || rows==5 || colmn==1 || colmn==5)
                 System.out.print(" "+"*");
               else 
                 System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}