import java.io.*;
class uppercase
{
	public static void main (String [] args)
	throws IOException
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		char a;
		System.out.print("Enter alphabet.:");
		a=(char)br.read();
		if((int)a>=65&&(int)a<=90)
			System.out.println("It is upper case.:");
		else
			System.out.println("It is lower case.:");
		
	}
}