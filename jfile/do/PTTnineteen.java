/*
 *          1
 *        1 2
 *      1 2 3
 *    1 2 3 4
 *  1 2 3 4 5
 */
import java.io.*;
class PTTnineteen{
           public static void main(String []args)
           throws IOException{
            int i,j,space;
             i=1; 
            do{
                space=4;
                 do{
                       if(space>=i)
                          System.out.print("  ");
                          space--;
                   }while(space>=i);
                    j=1;
                    do{
                       System.out.print(" "+j);
                       j++;
                      }while(j<=i);
                   System.out.print("\n");
                   i++;
              }while(i<=5);
 }
}