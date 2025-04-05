import java.io.*;

class EvnOdArray {
  public static void main(String[] args)
      throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int arr[] = new int[10];
    int i;
    System.out.println("\t\t\tEnter 10 elements");
    for (i = 0; i < 10; i++) {
      System.out.print("Enter " + i + " index element=");
      arr[i] = Integer.parseInt(br.readLine());
    }
    System.out.println("EVEN" + "\t" + "ODD");
    System.out.println("----" + "\t" + "---");
    for (i = 0; i < 10; i++) {
      if (arr[i] % 2 == 0)
        System.out.print(arr[i]);
      else
        System.out.print("\t" + arr[i]);
      System.out.print("\n");
    }
  }
}