import java.io.*;
class days {
	public static void main(String args[])
	throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int month = 0, year = 0, week = 0, days;

		System.out.print("Enter times in days.:");
		days = Integer.parseInt(br.readLine());
		if (days >= 365) {
			year = days / 365;
			days = days % 365;//360
		}
		if (days >= 30) {
			month = days / 30;//7601
			days = days % 30;
		}
		if (days >= 7) {
			week=days/7;
			days=days%7;
		}
	/*	System.out.println(year + "year\n" + month + "month\n" + week + "week\n" + days + "days");
	*/
		System.out.println("YEAR\t"+ "MONTH\t" + "WEEK\t" + "DAYS");
		System.out.println(year + "  :   " + month + "      :   " + week + "   :     " + days);
	}
}