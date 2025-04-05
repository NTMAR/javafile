import java.io.*;
class daysNext{
        public static void main(String[] args)
        throws IOException {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            int month = 0,year = 0,week = 0,days = 0;
            System.out.println("Enter times in days.");
            days = Integer.parseInt(br.readLine());
            if(days>=30){
                month = days/30;
                days = days%30;
            }
            if(month>=12){
                year = month/12;
                month = month%12;
            }
            if(days>=7){
                week = days/7;
                days = days%7;
            }

            System.out.println(year+" year\n"+month+" month\n"+week+" week\n"+days+" days");    

        }
}
