import java.io.*;

class Next {
  int num, bk, sm, rem, k;

  int armCheck() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter any number");
    num = Integer.parseInt(br.readLine());
    if (num > 0 && num < 10) {
      bk = num;
      sm = 0;
      while (bk > 0) {
        sm = sm + (bk % 10);
        bk = bk / 10;
      }
      if (num == sm)
        return (1);
      else
        return (0);
    } else if (num >= 10 && num < 100) {
      bk = num;
      sm = 0;
      while (bk > 0) {
        rem = bk % 10;
        sm = sm + (rem * rem);
        bk = bk / 10;
      }
      if (sm == num)
        return (1);
      else
        return (0);
    } else if (num >= 100 && num < 1000) {
      bk = num;
      sm = 0;
      while (bk > 0) {
        rem = bk % 10;
        sm  += (rem * rem * rem);
        bk = bk / 10;
      }
      if (sm == num)
        return (1);
      else
        return (0);
    } else
      return (2);
  }
}

class OTTArmCkMain {
  public static void main(String[] args) throws IOException {
    Next net = new Next();
    net.k = net.armCheck();
    if (net.k == 0)
      System.out.println(net.num + " is not armstrong number");
    else if (net.k == 1)
      System.out.println(net.num + " is a armstrong number");
    else if (net.k == 2)
      System.out.println(net.num + " You Entered more than 3 digit number");
  }
}
