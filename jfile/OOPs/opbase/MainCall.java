import java.io.*;

class Call {
   int one, too, tre;

   void Input() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter 1st no.");
      one = Integer.parseInt(br.readLine());
      System.out.println("Enter 2nd no.");
      too = Integer.parseInt(br.readLine());
   }

   void plus() {
      tre = one + too;
      System.out.println("The Sum=" + tre);
   }

   void minus() {
      tre = one - too;
      System.out.println("The Sub=" + tre);
   }

   void multi() {
      tre = one * too;
      System.out.println("The Product=" + tre);
   }

   void divi() {
      tre = one / too;
      System.out.println("The Division=" + tre);
   }

   void remain() {
      tre = one % too;
      System.out.println("The Module=" + tre);
   }
}

class MainCall {
   public static void main(String[] args) throws IOException {
      Call Act = new Call();
      Act.Input();
      Act.plus();
      Act.minus();
      Act.multi();
      Act.divi();
      Act.remain();
   }
}