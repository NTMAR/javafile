/*
 *                       *
 *                     *   *
 *                   *       *
 *                 *           *
 *               *               *
 *                 *           *
 *                   *       *
 *                     *   *
 *                       *
 */                      
import java.io.*;
class PTTthirteen{
       public static void main(String[]args)
           throws IOException{
            int i,j;
            i=1;
            do{ 
               j=1;
               do{ 
                       if(i+j==6||i-j==4||i+j==14||j-i==4)
                        System.out.print(" *");
                       else 
                         System.out.print("  ");
                     j++;
                 }while(j<=9);
               System.out.print("\n");
               i++;
              }while(i<=9);
 }
}