/*
 * 5
 * 4 5
 * 3 4 5
 * 2 3 4 5
 * 1 2 3 4 5
 */
import java.io.*;
class ptnUser{
    public static void main(String[] args)
           throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i,j;
        System.out.println("Enter number.");
        int n=Integer.parseInt(br.readLine());
        for(i=n;i>=1;i--){
            for(j=i;j<=n;j++)
             System.out.print(" "+j);
          System.out.print("\n");
        }
    }
}
