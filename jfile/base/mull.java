import java.io.*;
class mull {
 public static void main(String args[]) 
 throws IOException {
  BufferedReader ab= new BufferedReader(new InputStreamReader(System.in));
			int x,y,z;
			System.out.println("Enter a 1st no.:");
			x=Integer.parseInt(ab.readLine());
			System.out.println("Enter a 2nd no.:");
	    	y=Integer.parseInt(ab.readLine());
			z=x*y;
			System.out.println("Mull:" +z);	
	}
}