import java.io.*;

class Next {
  int arr[] = new int[5];
  int p;

  void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("\tEnter 5  natural number");
    for (p = 0; p < 5; p++) {
      System.out.println("Enter " + (p + 1) + " element");
      arr[p] = Integer.parseInt(br.readLine());
    }
  }
}

class Bubble extends Next {
  int ev, od;
  void isEvnOdd() {
    for (int k = 0; k < 5; k++) {
      if (arr[k] % 2 == 0) {
        ev++;
      } else
        od++;
    }
    System.out.println("No. of even numbers " + ev + "\nNo. of Odd numbers " + od);
  }
}

class Run extends Bubble {
  int a, k, j;

  void isPrime() {
    k = 0;
    for (j = 0; j < 5; j++) {
      a = 2;
      while (a < arr[j]) {
        if (arr[j] % a == 0) {
          break;
        }
        a++;
      }
      if (a == arr[j])
          k++;
    }
    System.out.println("No. of Prime number " + k);
    
  }
}

class Turn extends Bubble {
  int av, z, tot;

  void aveRage() {
    for (z = 0; z < 5; z++) {
      tot = tot + arr[z];
    }
    av = tot / 5;
    System.out.println("Average is " + av);
  }
}

class HybridHary {
  public static void main(String[] args) throws IOException {
   
  }
}
