import java.io.*;
class leapyearNext
                   { 
                      public static void main(String args[])
                            throws IOException
                         {
                           InputStreamReader is = new InputStreamReader(System.in);
                           BufferedReader br = new BufferedReader(is);
                           int year;
                           System.out.print("Enter year to check to leap year.: ");
                           year=Integer.parseInt(br.readLine());
                           if((year%4==0&&year%100!=0)||year%400==0)
                            {
                                System.out.println(year+"is a leap year.");                     
                            }
                            else 
                            {
                                 System.out.println(year+"is not leap year.");
                            }
                        }
                   }