import java.io.*;

class fndDataAry {
  public static void main(String[] args)
      throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int arr[] = new int[10];
    int i, data;
    for (i = 0; i < 10; i++) {
      System.out.print("Enter " + (i + 1) + " element=");
      arr[i] = Integer.parseInt(br.readLine());
    }
    System.out.println("Stored Elements in array");
    for (i = 0; i < 10; i++)
      System.out.println(arr[i]);
    System.out.print("Enter any number=");
    data = Integer.parseInt(br.readLine());
    for (i = 0; i < 10; i++) {
      if (arr[i] == data) {
        System.out.print("Data found");
        break;
      }
      if (i == 9)
        System.out.print("Not found");
    }
  }
}