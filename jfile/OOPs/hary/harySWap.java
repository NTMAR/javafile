import java.io.*;

class Next {

      void swap(int a, int b) {
            System.out.println("Before swap\n" + "a = " + a + " b = " + b);
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("After swap\n" + "a = " + a + " b = " + b);
      }
}

class You extends Next {
      int x, y;

      void input() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter 1s numb");
            int x = Integer.parseInt(br.readLine());
            System.out.println("Enter 2nd numb");
            int y = Integer.parseInt(br.readLine());
            swap(x, y);
      }
}

class harySWap {
      public static void main(String[] arg) throws IOException {
            You net = new You();
            net.input();
      }
}