import java.io.*;
class cubee{
 public static void main(String args[]) 
 throws IOException {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
			int x,cube;
			System.out.println("Enter a  no.:");
			x=Integer.parseInt(br.readLine());
			cube=x*x*x;
			System.out.println("cube:" +cube);	
	}
}