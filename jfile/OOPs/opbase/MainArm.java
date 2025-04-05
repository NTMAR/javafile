import java.io.*;

class Next {
  int rem, sum, x, a, no;

  void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter any number");
    no = Integer.parseInt(br.readLine());
    check();
  }

  void check() {
    if (no >= 100 && no <= 999)
      Armstrong();
    else
      Add();
  }

  void Armstrong() {
    a = no;
    while (a > 0) {
      rem = a % 10;
      sum = sum + (rem * rem * rem);
      a = a / 10;
    }
    if (sum == no)
      System.out.println("Number is Armstrong");
    else
      System.out.println("Not Armstrong");
  }

  void Add() {
    x = no;
    while (x > 0) {
      sum = sum + (x % 10);
      x = x / 10;
    }
    System.out.println("Addation of digit=" + sum);
  }
}

class MainArm {
  public static void main(String[] args) throws IOException {
    Next nt = new Next();
    nt.input();
  }
}