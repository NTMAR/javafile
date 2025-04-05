/*
 *            1 1 1 1 1
 *              2 2 2 2
 *                3 3 3
 *                  4 4
 *                    5                   
 */
import java.io.*;
class PTF3{
        public static void main(String[]args)
         throws IOException{
           int i,j,space;
           i=1;
           do{
               space=1;
               do{ 
                    if(space<i)
                        System.out.print("  ");
                      space++;
                 }while(space<i);
               j=i;
               do{
                   System.out.print(" "+i);
                    j++;
                 }while(j<=5);
               System.out.print("\n");
             i++;
             }while(i<=5);
 }
}