import java.io.*;
class PTTeleven{
       public static void main(String[]args)
           throws IOException{
            int i,j;
            i=1;
            do{ 
               j=1;
               do{ 
                       if(j==1||i==j||j==20)
                        System.out.print(" *");
                       else 
                         System.out.print("  ");
                     j++;
                 }while(j<=20);
               System.out.print("\n");
               i++;
              }while(i<=20);
 }
}