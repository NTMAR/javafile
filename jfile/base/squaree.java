import java.io.*;
class squaree{
 public static void main(String args[]) 
 throws IOException {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
			int x,square;
			System.out.println("Enter a  no.:");
			x=Integer.parseInt(br.readLine());
			square=x*x;
			System.out.println("Squre of "+x+" is "+square);	
	}
}