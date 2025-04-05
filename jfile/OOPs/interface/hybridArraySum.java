import java.io.*;

interface arrayOne {
   void createOne();
}

interface arrayTwo {
   void createTwo();
}

class Next implements arrayOne, arrayTwo {
   int arr[];
   int arrTwo[];
   int sum[];

   public void createOne() {
      arr = new int[5];
   }

   public void createTwo() {
      arrTwo = new int[5];
   }

   void input() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      for (int i = 0; i < 5; i++) {
         try {
            System.out.println("Enter " + (i + 1) + " elements");
            arr[i] = Integer.parseInt(br.readLine());
         } catch (Exception e) {
         }
      }

      System.out.println("Enter elements for 2nd array");
      for (int j = 0; j < 5; j++) {
         try {
            System.out.println("Enter " + (j + 1) + " elements");
            arrTwo[j] = Integer.parseInt(br.readLine());
         } catch (Exception e) {
         }
      }
   }

   void Add() {
      for (int k = 1; k < 5; k++) {
         arr[0] += arr[k];
      }
      for (int p = 1; p < 5; p++) {
         arrTwo[0] += arrTwo[p];
      }
   }

   void aBothArr() {
      sum = new int[1];
      sum[0] = arr[0] + arrTwo[0];
      System.out.println("Sum of Both of the array " + sum[0]);
   }
}

class action extends Next {
   int av;

   void Average() {
      av = sum[0] / 10;
   }

   void Disp() {
      System.out.println("Average of both of the array " + av);
   }
}

class hybridArraySum {
   public static void main(String[] args) throws IOException {
      action net = new action();
      net.createOne();
      net.createTwo();
      net.input();
      net.Add();
      net.aBothArr();
      net.Average();
      net.Disp();
   }
}