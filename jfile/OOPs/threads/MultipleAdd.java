import java.io.*;

class MultipleAdd {
   long a, x;

   long input() throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      a = Integer.parseInt(reader.readLine());
      return (a);
   }

   long option() throws IOException {
      System.out.println(
            "Which opration want to do.\n" + "1.Add" + "|2.Sub" + "|3.Mull" + "|4.Div" + "|5.Restart" + "|6.Exit");
      System.out.println("Enter Your choice");
      x = input();
      return (x);
   }

   long mull(long H) throws IOException {
      System.out.println("Enter a number");
      return (input() * H);
   }

   long add(long K) throws IOException {
      System.out.println("Enter a number");
      return (input() + K);
   }

   long sub(long S) throws IOException {
      System.out.println("Enter a number");
      return (input() - S);
   }

   long div(long D) throws IOException {
      System.out.println("Enter a number");
      return (input() / D);
   }

   public static void main(String[] args) throws IOException {
      MultipleAdd multipleAdd = new MultipleAdd();
      long choice, n;
      System.out.println("\t\tThis is Calculater");
      loop: do {
         System.out.println("\tStart menu\n" + "Enter number");
         n = multipleAdd.input();
         do {
            choice = multipleAdd.option();
            if (choice == 1) {
               n = multipleAdd.add(n);
               System.out.println("Result is " + n);
            }
            if (choice == 2) {
               n = multipleAdd.sub(n);
               System.out.println("Result is " + n);
            }
            if (choice == 3) {
               n = multipleAdd.mull(n);
               System.out.println("Result is " + n);
            }
            if (choice == 4) {
               n = multipleAdd.div(n);
               System.out.println("Result is " + n);
            }
            if (choice == 6) {
               break loop;
            }
         } while (choice != 5);
      } while (choice != 6);
   }
}