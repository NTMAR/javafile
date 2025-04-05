package len;
public class ConAge {
                   int year,month;

                public  void calculateDay(int days){
		if (days >= 360) {
			year = days / 360;
			days = days % 360;
		}
		if (days >= 30) {
			month = days / 30;
			days = days % 30;
		}
                  System.out.println(year+" year\n"+month+" month\n"+days+" days");    
	}
}