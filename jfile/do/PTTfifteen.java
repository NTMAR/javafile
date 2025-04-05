/*
 *               5
 *             4 5
 *           3 4 5
 *         2 3 4 5
 *       1 2 3 4 5 
 */
import java.io.*;
class PTTfifteen {
            public static void main(String []agrs)
                 throws IOException{
              int i,j,space;
                 i=5;
              do{
                  space=i;
                 do{
                     if(space>1)
                         System.out.print("  ");
                         space--;
                   }while(space>1);
                    j=i;
                     do{
                         System.out.print(" "+j);
                         j++;
                       }while(j<=5);
                    System.out.print("\n");
                      i--;
                }while(i>=1);
 }
}