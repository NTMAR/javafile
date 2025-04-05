/*
 *           *        
 *         * *
 *       * * *
 *     * * * *
 *   * * * * *
 */
import java.io.*;
class PTTone{
    public static void main(String []args)
     throws IOException{
       int i,j,space;
       i=1;
       do{
           space=i;
            do{  
                 if(space<5)
                 System.out.print("  ");
                 space++;
              }while(space<5);
           j=1;
           do{
              System.out.print(" *");
               j++;
             }while(j<=i);
          System.out.print("\n");
          i++;
         }while(i<=5);
  }
}