/*
 *           5 4 3 2 1
 *             4 3 2 1
 *               3 2 1
 *                 2 1
 *                   1
 *
 */
import java.io.*;
class PTFthree{
        public static void main(String []agrs)
          throws IOException{
        int i,j,space;
        for(i=5;i>=1;i--)
        {
          for(space=5;space>i;space--)
            System.out.print("  ");
          for(j=i;j>=1;j--)
            System.out.print(" "+j);
           System.out.print("\n");
        }
      }
    }