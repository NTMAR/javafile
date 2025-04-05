import java.io.*;

class Next {
   int arr[];
   int i;

   void input() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       arr = new int[5];
      for (i = 0; i < 5; i++) {
         System.out.println("Enter " + (i + 1) + " elements");
         arr[i] = Integer.parseInt(br.readLine());
      }
   }
}

class You extends Next {
   void perform() {
      for (i = 1; i < 5; i++)
         arr[0] += arr[i];
      System.out.println("Add is " + arr[0]);
   }
}

class Seat extends You {
   int av;

   void act() {
      av = arr[0] / 5;
      System.out.println("Average is " + av);

   }
}

class ArrayTot {
   public static void main(String[] args) throws IOException {
      Seat eat = new Seat();
      eat.input();
      eat.perform();
      eat.act();
   }
}