package len;

public class dayPack {
   int month, year,week;

	public void findYearMonDay(int days) {
		month = year = week = 0;

		if (days >= 365) {
			year = days / 365;
			days = days % 365;//360
		}
		if (days >= 30) {
			month = days / 30;
			days = days % 30;
		}
		if (days >= 7) {
			week=days/7;
			days=days%7;
		}

		System.out.println("YEAR\t"+ "MONTH\t" + "WEEK\t" + "DAYS");
		System.out.println(year + "  :   " + month + "      :   " + week + "   :     " + days);
	}
}