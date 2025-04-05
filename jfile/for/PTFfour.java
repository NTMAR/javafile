/*
 *           5 4 3 2 1
 *             5 4 3 2
 *               5 4 3
 *                 5 4
 *                   5
 *
 */
import java.io.*;
class PTFfour{
        public static void main(String []agrs)
          throws IOException{
        int i,j,space;
        for(i=1;i<=5;i++)
        {
          for(space=1;space<i;space++)
            System.out.print("  ");
          for(j=5;j>=i;j--)
            System.out.print(" "+j);
           System.out.print("\n");
        }
      }
    }