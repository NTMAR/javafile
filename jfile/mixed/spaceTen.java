/*            A B C D E
 *            5 4 3 2 1
 *              B C D E
 *              4 3 2 1
 *                C D E
 *                3 2 1
 *                  D E
 *                  2 1
 *                    E
 *                    1
 */
import java.io.*;
class spaceTen{
           public static void main(String []agrs)
              throws IOException{
               int rows,space,n,m,k;
             k=65;
           for(rows = 5; rows >=1;rows--){
              for(space = 5;space>rows;space--)
                     System.out.print("  ");
              for(m=k;m<=69;m++)
                 System.out.print(" "+(char)m);
            System.out.print("\n");
              for(space=5;space>rows;space--)
                   System.out.print("  ");
               for(n=rows;n>=1;n--)
                  System.out.print(" "+n);
              k+=1;
               System.out.print("\n");
          }
       }          
    }