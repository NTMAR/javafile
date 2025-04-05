
/* Method calling method using  class and object*/
import java.io.*;

class NextCal {
  int no;

  void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter any number");
    no = Integer.parseInt(br.readLine());
    Area();
  }

  void Area() {
    System.out.println("Area of circle=" + (3.14 * no * no));
    Square();
  }

  void Square() {
    System.out.println("Square of number=" + (no * no));
    Cube();
  }

  void Cube() {
    System.out.println("Cube of number=" + (no * no * no));
  }
}

class MainSquareOne {
  public static void main(String[] args) throws IOException {
    NextCal ect = new NextCal();
    ect.input();
  }
}