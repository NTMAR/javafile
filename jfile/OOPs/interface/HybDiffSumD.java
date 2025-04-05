import java.io.*;

class Next {
   int numb;

   void input() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter any number");
      numb = Integer.parseInt(br.readLine());
   }
}

class Bubble extends Next {
   int a;

   int isPrime() {
      a = 2;
      while (a < numb) {
         if (numb % a == 0) {
            break;
         }
         a += 1;
      }
      if (a == numb) {
         System.out.println("Number is prime " + numb);
         return (1);
      } else {
         System.out.println("Number is not prime");
         return (0);
      }
   }
}

class DigitC extends Bubble {
   int count;
   int no;

   void countDigit() {
      count = 0;
      for (no = numb; no > 0; no /= 10) {
         count += 1;
      }
      System.out.println("Number of Digit is = " + count);
   }

   void check() {
      int x = isPrime();
      if (x == 1)
         countDigit();
   }
}

class Arm extends Next {
   int z, sum, rem;

   int checkArmstrong() {
      sum = 0;
      z = numb;
      while (z > 0) {
         rem = z % 10;
         sum = sum + (rem * rem * rem);
         z = z / 10;
      }
      if (sum == numb) {
         System.out.println("It is ArmStrong number");
         return (1);
      } else {
         System.out.println("It is not ArmStrong number");
         return (0);
      }
   }
}

class SumD extends Arm {
   int sumx, y;

   void sumDigit() {
      for (int n = numb; n > 0; n /= 10) {
         sumx = sumx + (n % 10);
      }
      System.out.println("Addation of Digit is " + sumx);
   }

   void sumOfDigitCheck() {
      if (numb <= 999) {
         y = checkArmstrong();
         if (y == 1)
            sumDigit();
      }
   }
}

class HybDiffSumD {
   public static void main(String[] args) throws IOException {
      DigitC c = new DigitC();
      SumD d = new SumD();
      c.input();
      c.check();
      d.input();
      d.sumOfDigitCheck();
   }
}
