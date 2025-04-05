import java.io.*;
public class SI {
	public static void main(String[] args) 
	throws IOException{
	InputStreamReader ISR=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ISR);
int Amount;
int LoanAmount;
int Rate;
int Time;
System.out.println("Enter loan Amount:");
LoanAmount=Integer.parseInt(br.readLine());
System.out.println("Enter the Rate:");
Rate=Integer.parseInt(br.readLine());
System.out.println("Enter the time:");
Time=Integer.parseInt(br.readLine());
Amount=(LoanAmount*Rate*Time)/100;
System.out.println("Simple Interest is "+Amount);
	}
}