import java.io.*;

class Next {
     int a, b;

     void Input() throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter 1st number");
          a = Integer.parseInt(br.readLine());
          System.out.println("Enter 2nd number");
          b = Integer.parseInt(br.readLine());
     }
}

class Bubble extends Next {
     int c;

     void Call() {
          c = a - b;
          System.out.println("Subtration is = " + c);
     }
}

class SubSingHari {
     public static void main(String[] ars) throws IOException {
          Bubble bulb = new Bubble();
          bulb.Input();
          bulb.Call();
     }
}