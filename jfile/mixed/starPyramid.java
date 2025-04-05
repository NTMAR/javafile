/*
 *                        *
 *                      *   *
 *                    *       *
 *                  *           *
 *                * * * * * * * * *             
 */
import java.io.*;
class starPyramid{
    public static void main(String[] args) 
          throws IOException{
        int rows,colmn,k,space;
        k=1;
        for(rows=1;rows<=5;rows++)
        {
            for(colmn=1;colmn<=9;colmn++)
            {
               if(rows==5 || rows+colmn==6 || colmn-rows==4)
                 System.out.print(" "+"*");
               else 
                 System.out.print("  ");
            }
          //  k+=2;
            System.out.print("\n");
        }
    }
}
/*Not correct*/
