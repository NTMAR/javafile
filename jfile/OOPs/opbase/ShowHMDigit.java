import java.io.*;

class Next {
  int x, cnt;

  int Scan(int z) {
    cnt = 0;
    while (z > 0) {
      cnt += 1;
      z /= 10;
    }
    return (cnt);
  }
}

class ShowHMDigit {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Next net = new Next();
    System.out.println("Enter any number");
    int y = Integer.parseInt(br.readLine());
    net.x = net.Scan(y);
    System.out.println("Number of Digit is " + net.x);
  }
}
