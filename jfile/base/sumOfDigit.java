import java.io.*;
class sumOfDigit{
 public static void main(String args[]) 
 throws IOException {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
			int num,last,scnd,frst,sum;
			System.out.println("Enter 3 digit no.:");
			num=Integer.parseInt(br.readLine());
			last=num%10;
			num=num/10;
			scnd=num%10;
			num=num/10;
			frst=num;
			sum=last+scnd+frst;
			System.out.println("sum of digit is "+sum);	
	}
}