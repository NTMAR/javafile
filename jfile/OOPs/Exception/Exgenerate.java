import java.io.*;

class Exgenerate {
  public static void main(String[] args) {
    int a[] = new int[] { 5, 4 };
    int x;
    try {
      for (x = 0; x < 3; x++)
        System.out.println(a[x]);
    } catch (NumberFormatException ne) {
      System.out.println("It is number format exception");
    } catch (ArrayIndexOutOfBoundsException be) {
      System.out.println("It is an array out of bounds exception");
    } catch (ArithmeticException ae) {
      System.out.println("It is an arithmetic exception");
    }
  }
}
/*
 * 5
 * 4
 * It is an array out of bounds exception
 */