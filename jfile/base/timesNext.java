import java.io.*;
class timesNext{
          public static void main(String []args)
             throws IOException{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           int sec,min,hr;
           sec=0;
           min=0;
           hr=0;
           System.out.println("Enter times in seconds");
           sec = Integer.parseInt(br.readLine());
           if(sec>=60){
              min=sec/60;
              sec =sec%60;
           }
           if(min>=60){
               hr=min/60;
               min=min%60;
           }
          System.out.println("Hour="+hr+" Minutes="+min+" Seconds="+sec);
   }            
}