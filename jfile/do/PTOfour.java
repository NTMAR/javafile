/*
 *     1
 *     2 1
 *     3 2 1
 *     4 3 2 1
 *     5 4 3 3 1
 */
import java.io.*;
class PTOfour{                                                                                                                 
           public static void main(String []args)
           throws IOException{
           int i,j;
           i=1;
           do{
              j=i;
              do{
                  System.out.print(" "+j);
                  j-=1;
                }while(j>=1);
               System.out.print("\n");
               i+=1;
             }while(i<=5);
           }       
         }