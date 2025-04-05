import java.io.*;

class Next {
   int p, r, t, si;

   void Act() {
      si = (p * r * t) / 100;
      System.out.println("Interest is =" + si);
   }
}

class SimInteoop {
   public static void main(String[] args) throws IOException {
      Next net = new Next();
      net.Act();
   }
}
// default constructors