import java.io.*;

class Next {
   int arr[] = new int[20];
   int Odd[] = new int[20];
   int Even[] = new int[20];
   int i, m = 0, n = 0,x,y;

   void input() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("\t\tEnter any 20 natural numbers");
      i = 0;
      while (i < 20) {
         System.out.print("Enter " + (i + 1) + " number=");
         arr[i] = Integer.parseInt(br.readLine());
         i += 1;
      }
      Sep();
      Ans();
   }

   void Sep() {
      x = 0;
      while (x < 20) {
         if (arr[x] % 2 == 0) {
            Even[m] = arr[x];
            m += 1;
         } else {
            Odd[n] = arr[x];
            n += 1;
         }
         x += 1;
      }
   }

   void Ans() {
      y = 0;
      System.out.println("Even\tOdd");
      while (y < 20) {
         System.out.print(Even[y] + "\t" + Odd[y]);
         System.out.println();
         y += 1;
      }

   }
}

class MainSepOdEn {
   public static void main(String[] args) throws IOException {
      Next net = new Next();
      net.input();
   }
}