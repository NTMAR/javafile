/*
 *     @ @ @ @ @
 *     @ @ @ @ 
 *     @ @ @
 *     @ @ 
 *     @ 
*/
import java.io.*;
class ptnTwe{
    public static void main(String[] args)
          throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter number.");
            int n=Integer.parseInt(br.readLine());
        int i,j;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++)
                 System.out.print(" "+"@");
            System.out.print("\n");
        }
    }
}
