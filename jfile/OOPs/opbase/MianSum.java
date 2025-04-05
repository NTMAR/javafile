import java.io.*;

class Sum {
   int one, too, tre;

   void Add() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter 1st no.");
      one = Integer.parseInt(br.readLine());
      System.out.println("Enter 2nd no.");
      too = Integer.parseInt(br.readLine());
      tre = one + too;
      System.out.println("The Sum=" + tre);
   }
}

class MianSum {
   public static void main(String[] args) throws IOException {
      Sum plus = new Sum();
      plus.Add();
   }
}