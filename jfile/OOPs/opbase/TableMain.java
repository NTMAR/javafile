import java.io.*;

class Next {
   int i, es, k, j;

   void Act(int no) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      if (no > 0) {
         show(no);
      } else if (no < 0) {
         System.out.println("It is negative number\n" + "Convert it into positive number then Enter 1");
         es = Integer.parseInt(br.readLine());
         if (es == 1) {
            k = no * -1;
            System.out.println("Number is=" + k);
            show(k);
         }

      } else
         System.out.println("It is Neutral number");
   }

   void show(int m) {
      for (j = 1; j <= 10; j++)
         System.out.println(m + "x" + j + "=" + m * j);
   }
}

class TableMain {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int x;
      Next net = new Next();
      System.out.println("Enter any no.");
      x = Integer.parseInt(br.readLine());
      net.Act(x);
   }
}
