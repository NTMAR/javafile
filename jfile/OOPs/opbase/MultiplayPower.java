import java.io.*;

class Next {
   int base, exo, reserve, add;

   void Act() throws IOException {
      Input();
      add = 1;
      reserve = base;
      while (exo != 0) {
         base *= add;
         add = reserve;
         exo -= 1;
      }
      System.out.println("Final value is " + base);
   }
   void Input() throws IOException {
      BufferedReader $ease = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter base number");
      base = Integer.parseInt($ease.readLine());
      System.out.println("Enter Exponent of number");
      exo = Integer.parseInt($ease.readLine());
   }
}

class MultiplayPower {
   public static void main(String[] args) throws IOException {
      Next net = new Next();
      net.Act();
   }
}