import java.io.*;
class daysTwo {
	public static void main(String args[])
	throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		while (true) {
			int month = 0, year = 0, week = 0, days;

			System.out.print("Enter times in days.:");
			days = Integer.parseInt(br.readLine());

			if (days >= 7) {
				month = days / 30;
				week = days % 30;
				days = week % 7;
			}
			if (week >= 1) {
				week = week / 7;
			}
			if (month >= 12) {
				year = month / 12;
				month = month % 12;
			}

			System.out.println("YEAR\t"
							   + "MONTH\t" + "WEEK\t" + "DAYS");
			System.out.println(year + "  :   " + month + "      :   " + week + "   :     " + days);
		}
	}
}