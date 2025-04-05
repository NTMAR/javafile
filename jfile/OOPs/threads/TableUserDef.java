import java.io.*;

class TableUserDef extends Thread {
  int no, i;

  void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a number");
    no = Integer.parseInt(br.readLine());
  }

  public void run() {
    for (i = 1; i <= 10; i++) {
      try {
        Thread.sleep(300);
        System.out.println(no + "x" + i + "=" + no * i);
      } catch (InterruptedException ae) {
      }
    }
  }

  public static void main(String[] args) throws IOException {
    TableUserDef ab = new TableUserDef();
    ab.input();
    ab.start();
  }
}
