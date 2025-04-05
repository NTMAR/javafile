import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class celsius{
 public static void main(String args[]) 
 throws IOException {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
			double c,f;
			System.out.println("Enter celsius.:");
			c=Double.parseDouble(br.readLine());
			f=c*1.8+32;
			System.out.println("Fahrenheit:" +f);	
	}
}