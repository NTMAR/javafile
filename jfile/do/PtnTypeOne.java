import java.io.*;
class PtnTypeOne{
           public static void main(String []args)
           throws IOException{
           int i,j;
           i=1;
           do{
              j=1;
              do{
                  System.out.print(" $");
                  j+=1;
                }while(j<=i);
               System.out.print("\n");
               i+=1;
             }while(i<=50);
           }       
         }