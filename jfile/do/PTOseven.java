import java.io.*;
class PTOseven{
            public static void main(String []agrs)
              throws IOException{
                int i,j;
               i=5;
          do{
              j=5;
               do{
                    System.out.print(" "+j);
                    j--;
                 }while(j>=i);
              System.out.print("\n");
               i--;
            }while(i>=1);
       }
     }