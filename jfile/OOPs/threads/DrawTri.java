import java.io.*;

class DrawTri {
  int i, j;

  void draw() {
    loop: for (i = 1; i <= 10; i++) {
      System.out.print("\n");
      if (i == 6)
        break;
      for (j = 1; j <= 5; j++) {
        System.out.print("*");
        if (i == j)
          continue loop;
      }
    }
  }

  public static void main(String[] args) {
    DrawTri drawTri = new DrawTri();
    drawTri.draw();
  }
}