import java.io.*;
class leap_year {
	public static void main(String args[])
	throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int  year;

		System.out.print("Enter year to check leap year.:");
		year = Integer.parseInt(br.readLine());
		if (((year % 4 == 0 && year % 100 != 0))||(year % 400== 0)) {
			System.out.println(year + " is  a leap yaer");
		}
		if (((year % 4 != 0 && year % 100 == 0))||(year % 400 != 0)) {
			System.out.println(year + " not a leap year");
		} 

	}
}