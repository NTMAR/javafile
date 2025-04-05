/*
 *                        *
 *                      *   *
 *                    *       *
 *                  *           *
 *                * * * * * * * * *             
 */
import java.io.*;
class hollowPyr{
           public static void main(String []args)  
                throws IOException{
                      int i,j;
                      int n;
                      n=5;
                    for(i=1;i<=n;i++){
                         for(j=1;j<=9;j++){
                             if(j-i==4||i==n||i+j==6)
                                  System.out.print("*");
                               else 
                                 System.out.print(" ");
                 }
                  System.out.print("\n");
               }   
          }
     }