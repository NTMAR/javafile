import java.io.*;

abstract class Disp {
  int arr[] = new int[5];

  abstract void add();

  void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("\tEnter 5 elements");
    for (int i = 0; i < 5; i++) {
      System.out.println("Enter " + (i + 1) + " elements");
      arr[i] = Integer.parseInt(br.readLine());
    }
  }
}

class Sum extends Disp {
  void add() {
    for (int j = 1; j < 5; j++) {
      arr[0] = arr[0] + arr[j];
    }
    System.out.println("Sum of elements = " + arr[0]);
  }
}

class Average extends Sum {
  void avge() {
    int av = arr[0] / 5;
    System.out.println("Average is " + av);
  }
}

class AbstractMultiLevel {
  public static void main(String[] args) throws IOException {
    Average er = new Average();
    er.input();
    er.add();
    er.avge();
  }
}