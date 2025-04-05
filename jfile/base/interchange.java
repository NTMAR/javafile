import java.io.*;
class interchange {
 public static void main(String args[]) 
 throws IOException {
  BufferedReader ab= new BufferedReader(new InputStreamReader(System.in));
			int a,b;
			System.out.println("Enter a 1st no.:");
			a=Integer.parseInt(ab.readLine());
		System.out.println("Enter a 2nd no.:");
	    	b=Integer.parseInt(ab.readLine());
			System.out.println("Before swapping:\n a:"+a+"\t b:"+b);
			a=a+b-(b=a);
			System.out.println("After swapping:\n a:"+a+"\t b:"+b);	
	}
}