import java.io.*;

class Next {
        static int a; 
        int c;

   int Sri() {
      a += 1;
      return (a);
   }
}

class MainSeries {
   public static void main(String[] args) {
      Next net = new Next();
      int x;
      x = 1;
      while (x <= 10) {
         net.c = net.Sri();
         System.out.println(net.c);
         x += 1;
      }
   }
}