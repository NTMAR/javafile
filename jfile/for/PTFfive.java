/*
 *           A B C D E
 *             A B C D
 *               A B C 
 *                 A B
 *                   A
 *
 */
import java.io.*;
class PTFfive{
        public static void main(String []agrs)
          throws IOException{
        int i,j,space;
        for(i=69;i>=65;i--)
        {
          for(space=69;space>i;space--)
            System.out.print("  ");
          for(j=65;j<=i;j++)
            System.out.print(" "+(char)j);
           System.out.print("\n");
        }
      }
    }