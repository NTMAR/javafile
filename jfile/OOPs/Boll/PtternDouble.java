import java.io.*;
import java.util.*;

class PtternDouble {
  public static void main(String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number");
    double n = sc.nextDouble();
    for(int i = 1; i <= 5; i++){
       for(int j = 1; j <= 1; j++){
         System.out.print(n);
          for(int k = 1; k <= i; k++){
             System.out.print(k);
          }
       }
     System.out.print("\n");
    }
  }
}