/*
 *           A B C D E
 *             B C D E
 *               C D E
 *                 D E
 *                   E
 *
 */
import java.io.*;
class PTFsix{
        public static void main(String []agrs)
          throws IOException{
        int i,j,space;
        for(i=65;i<=69;i++)
        {
          for(space=65;space<i;space++)
            System.out.print("  ");
          for(j=i;j<=69;j++)
            System.out.print(" "+(char)j);
           System.out.print("\n");
        }
      }
    }