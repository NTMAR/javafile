/*
 *            5 5 5 5 5
 *              4 4 4 4
 *                3 3 3
 *                  2 2
 *                    1                   
 */
import java.io.*;
class PTF2{
        public static void main(String[]args)
         throws IOException{
           int i,j,space;
           i=5;
           do{
               space=5;
               do{ 
                    if(space>i)
                        System.out.print("  ");
                      space--;
                 }while(space>i);
               j=1;
               do{
                   System.out.print(" "+i);
                    j++;
                 }while(j<=i);
               System.out.print("\n");
             i--;
             }while(i>=1);
 }
}