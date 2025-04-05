import java.io.*;
class name{
           public static void main(String []args)  
                throws IOException{
                      int i,j;
                      int n;
                      n=25;
                    for(i=1;i<=n;i++){
                         for(j=1;j<=n;j++){
                             if(i==j||j==1||j==n)
                                  System.out.print("*");
                               else 
                                 System.out.print(" ");
                 }
                  System.out.print("\n");
               }   
          }
     }