import java.io.*;

class abcFinal {
  public static void main(String[] args) {
    int a = 5;
    final int b = 10;
    System.out.println("a= " + a + "b= " + b);
    b += 1;
    System.out.println("a= " + a + "b= " + b);
  }// this program give error
}