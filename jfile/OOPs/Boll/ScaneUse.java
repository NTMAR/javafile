import java.io.*;
import java.util.*;

class ScaneUse{
  public static void main(String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter 1st number");
    int x = sc.nextInt();
    System.out.println("Enter 2nd number");
    int y = sc.nextInt();
    x = x + y;
    System.out.println("Sum is "+x);
  }
}