/*
 *           e d c b a
 *             d c b a
 *               c b a 
 *                 b a
 *                   a
 *
 */
import java.io.*;
class PTFseven{
        public static void main(String []agrs)
          throws IOException{
        int i,j,space;
        for(i=101;i>=97;i--)
        {
          for(space=101;space>i;space--)
            System.out.print("  ");
          for(j=i;j>=97;j--)
            System.out.print(" "+(char)j);
           System.out.print("\n");
        }
      }
    }