/*
 *     1
 *     1 2
 *     1 2 3
 *     1 2 3 4
 *     1 2 3 4 5
 */
import java.io.*;
class PTOneNum{
           public static void main(String []args)
           throws IOException{
           int i,j;
           i=1;
           do{
              j=1;
              do{
                  System.out.print(" "+j);
                  j+=1;
                }while(j<=i);
               System.out.print("\n");
               i+=1;
             }while(i<=5);
           }       
         }