import java.io.*;
class PTFOne{
        public static void main(String []agrs)
          throws IOException{
        int i,j,space;
        for(i=1;i<=5;i++)
        {
          for(space=1;space<i;space++)
            System.out.print("  ");
          for(j=5;j>=i;j--)
            System.out.print(" "+i);
           System.out.print("\n");
        }
      }
    }