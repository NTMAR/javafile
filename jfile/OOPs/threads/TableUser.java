import java.io.*;

class TableUser extends Thread {
   int no, i;

   public void run()

   {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter a number");
         no = Integer.parseInt(br.readLine());

         for (i = 1; i <= 10; i++) {
            System.out.println(no + "x" + i + "=" + no * i);
            Thread.sleep(1000);
         }
      } catch (Exception e) {
      }

   }

   public static void main(String[] args) throws IOException {
     TableUser ab = new TableUser();
      ab.start();
   }
}
