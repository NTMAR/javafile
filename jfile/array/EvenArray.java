import java.io.*;

class EvenArray {
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
    System.out.println("Even Numbers are.");
    for (i = 0; i < 10; i++) {
      if (arr[i] % 2 == 0)
        System.out.println(arr[i]);
    }
  }
}