import java.io.*;
class primeNextM{
               public static void main(String []args)
                throws IOException{
                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                 int i,no;
                  System.out.println("\t\t\t1 and 0 are not prime number.");
                 System.out.println("Enter any number");
                 no=Integer.parseInt(br.readLine());
                 i=2;
                while(i<=no/2)
                {
                   if(no%i==0)
                        break;
                      i+=1;
                }
                if(i>no/2)
                  System.out.println("Prime number");
                else 
                  System.out.println("Not prime number");
 }
}