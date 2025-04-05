import java.io.*;

class BoolDtaPro {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean check;
    System.out.println("Enter a number");
    int num = Integer.parseInt(br.readLine());
    check = num % 2 == 0;
    if (check == true) {
      System.out.println("Number is even");
    } else
      System.out.println("Number is odd");

  }
}