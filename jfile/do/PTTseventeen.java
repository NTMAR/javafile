/*
 *            5
 *          5 4
 *        5 4 3
 *      5 4 3 2 
 *    5 4 3 2 1
 */
import java.io.*;
class PTTseventeen{
              public static void main(String[]agrs)
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
                      j=5;
                       do{
                           System.out.print(" "+j);
                              j--;
                         }while(j>=i);
                      System.out.print("\n");
                       i--;
                   }while(i>=1);
  }
 }