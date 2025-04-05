import java.io.*;

class Next {
   int a, b;

   void Disp() {
      a = 10;
      b = 20;
      System.out.println(a + b);
   }
}

class Bubble extends Next {
   void Show() {
      System.out.println("This is Bubble class");
   }
}

class HerySingle {
   public static void main(String[] args) throws IOException {
      Bubble bulb = new Bubble();
      bulb.Show();
      bulb.Disp();
   }
}