/*
 *     1
 *     2 2
 *     3 3 3
 *     4 4 4 4
 *     5 5 5 5 5
 */
import java.io.*;
class PTOthree{                                                                                                                 
           public static void main(String []args)
           throws IOException{
           int i,j;
           i=1;
           do{
              j=1;
              do{
                  System.out.print(" "+i);
                  j+=1;
                }while(j<=i);
               System.out.print("\n");
               i+=1;
             }while(i<=5);
           }       
         }