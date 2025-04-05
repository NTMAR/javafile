import java.io.*;

class ArStrong {
  static int rem = 0;
  static int sum = 0;
  static int pno = 0;

  static int armStrongG(int nmb) {
    pno = nmb;
    do {
      rem = nmb % 10;
      sum = sum + (rem * rem * rem);
      nmb = nmb / 10;
    } while (nmb > 0);
    if (sum == pno)
      return (1);
    else
      return (0);
  }
}

class FArmStrong {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter any number");
    int la = Integer.parseInt(br.readLine());
    if (la > 99 && la < 1000) {
      int x = ArStrong.armStrongG(la);
      if (x == 1) {
        System.out.println("Number is Armstrong");
      } else
        System.out.println("Number is not Armstrong");
    } else
      System.out.println("Enter three digit number");
  }
}