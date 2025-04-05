import java.io.*;
class changedayweekyearmonth {
	public static void main(String args[])
	throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int month, year, week, days, time;
		System.out.print("Enter times in days.:");
		time = Integer.parseInt(br.readLine());
		year = time / 360;
		month = time % 360;
		week = month % 30;
		days = week % 7;
		week = week / 7;
		month = month / 30;
		System.out.println("YEAR\t"
						   + "MONTH\t" + "WEEK\t" + "DAYS");
		System.out.println(year + "  :   " + month + "      :   " + week + "   :     " + days);
	}
}