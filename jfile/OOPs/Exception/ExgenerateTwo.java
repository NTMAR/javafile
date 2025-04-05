import java.io.*;

class ExgenerateTwo {
  public static void main(String[] args) {
    int a;
    try {
      a = 5 / 0;
    } catch (NumberFormatException ne) {
      System.out.println("It is number format exception");
    } catch (ArrayIndexOutOfBoundsException be) {
      System.out.println("It is an array out of bounds exception");
    } catch (NullPointerException np) {
      System.out.println("It is null pointer exception");
    }
  }
}
// This program give erorr