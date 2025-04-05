import java.io.*;

class arrayOne {
  public static void main(String[] args)
      throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int arr[] = new int[5];
    System.out.println("Enter 1st elements");
    arr[0] = Integer.parseInt(br.readLine());
    System.out.println("Enter 2nd elements");
    arr[1] = Integer.parseInt(br.readLine());
    System.out.println("Enter 3rd elements");
    arr[2] = Integer.parseInt(br.readLine());
    System.out.println("Enter 4th elements");
    arr[3] = Integer.parseInt(br.readLine());
    System.out.println("Enter 5th elements");
    arr[4] = Integer.parseInt(br.readLine());
    System.out.println("Stored Elements are.");
    System.out.println("1st elements=" + arr[0]);
    System.out.println("2nd elements=" + arr[1]);
    System.out.println("3rd elements=" + arr[2]);
    System.out.println("4th elements=" + arr[3]);
    System.out.println("5th elements=" + arr[4]);
  }
}
