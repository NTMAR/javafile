import java.io.*;

interface Disp {
   public static final int arr[] = new int[12];
}

interface Show {
   public abstract void input() throws IOException;
}

class ShowArray implements Disp, Show {
   public void input() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      for (int x = 0; x < 12; x++) {
         System.out.println("Enter " + (x + 1) + " elements");
         arr[x] = Integer.parseInt(br.readLine());
      }
   }
}

class ArrayInterPrint {
   public static void main(String[] args) throws IOException {
      ShowArray net = new ShowArray();
      net.input();
      System.out.println("Elements are");
      for (int j = 0; j < 12; j++) {
         System.out.print(Disp.arr[j] + " ");
      }
   }
}
