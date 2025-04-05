import java.io.*;

class Next {
   int count = 0;

   int digitAre(Long n) {
      count = 0;
      for (long no = n; no > 0; no /= 10) {
         count += 1;
      }
      return (count);
   }
}

class ArmStrongAnyNum extends Thread {
   public static void main(String[] args) {
      Next net = new Next();
      long z, a, sum, rem, add, digit, mull;
      z = 0;
      System.out.println("Armstrong number:");
      try{
      for (a = 100; a <= 9999; a++) {
         add = 0;
         digit = net.digitAre(a);
         for (long num = a; num > 0; num = num / 10) {
            mull = 1;
            rem = num % 10;
            for (long x = 1; x <= digit; x++) {
               mull = mull * rem;
            }
            sum = mull;
            add = add + sum;
         }
         if (add == a){
          Thread.sleep(1000);
          System.out.println((z += 1) + "." + a);
         }
      }
   } catch (Exception e){
      System.out.println("Exception handled");
   }
    System.out.println("Total " + z + " armstrong between 100 to 9999");
   }
}