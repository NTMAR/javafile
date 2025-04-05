/*
 *            1 2 3 4 5
 *              1 2 3 4
 *                1 2 3
 *                  1 2
 *                    1                   
 */
import java.io.*;
class PTF4{
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
                   System.out.print(" "+j);
                    j++;
                 }while(j<=i);
               System.out.print("\n");
             i--;
             }while(i>=1);
 }
}