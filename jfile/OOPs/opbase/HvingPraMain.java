import java.io.*;

class Sri {
  double slv;

  void Cols(int r) {
    slv = 3.14 * r * r;
    System.out.println("Area of circle=" + slv);
    slv = 2 * 3.14 * r;
    System.out.println("Circumference of circle=" + slv);
  }
}

class HvingPraMain {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x;
    Sri Cir = new Sri();
    System.out.println("Enter Radius of circle");
    x = Integer.parseInt(br.readLine());
    Cir.Cols(x);
  }
}