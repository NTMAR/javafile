/*
 *     5
 *     4 5
 *     3 4 5
 *     2 3 4 5
 *     1 2 3 4 5
 */
import java.io.*;
class PTOfive{                                                                                                                 
           public static void main(String []args)
           throws IOException{
           int i,j;
           i=5;
           do{
              j=i;
              do{
                  System.out.print(" "+j);
                  j+=1;
                }while(j<=5);
               System.out.print("\n");
               i-=1;
             }while(i>=1);
           }       
         }