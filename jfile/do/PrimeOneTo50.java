import java.io.*;
class PrimeOneTo50{
      public static void main(String[]args)
          throws IOException{
     int i,j,prime;
      System.out.println("Prime Number are.");
     i=1;
     do{
        prime=0;
        j=1;
        do{
               if(i%j==0)
                  prime=prime+1;
               j++;  
          }while(j<=i);
        if(prime==2)
          System.out.println(i);
        i++;
       }while(i<=50);
     }
   }