import java.io.*;

class Next {
   int no, x, y;

   void Input() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter any Natural number");
      no = Integer.parseInt(br.readLine());
   }

   int Perfect_Square() {
      y = 1;
      while (no > 0) {
         no -= y;
         y += 2;
      }
      if (no == 0)
         return (1);
      else
         return (0);
   }
}

class CheckPerFsqure {
   public static void main(String[] args) throws IOException {
      Next net = new Next();
      net.Input();
      int x = net.Perfect_Square();
      if (x == 1)
         System.out.println("It is Perfect Square");
      else
         System.out.println("It is not perfect Square");
   }
}