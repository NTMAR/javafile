import java.io.*;
class Fahrenheit{
 public static void main(String args[]) 
 throws IOException {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
			double c,f;
			System.out.println("Enter fahrenheit.:");
			f=Double.parseDouble(br.readLine());
			c=(f-32)/1.8;
			System.out.println("Celsius " +c);	
	}
}