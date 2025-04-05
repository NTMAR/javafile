import java.io.*;

class ShowHellDiffWay extends Thread {
  int choice;
  char hello[];
  int m, n;

  int input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    return (n);
  }

  public void run() {
    do {
      optionChoice();
      System.out.println("\nEnter 1 to Continue and 2 for Exit");
      try {
        choice = input();
      } catch (Exception e) {
      }
    } while (choice == 1);
  }

  void optionChoice() {
    System.out.println("\tEnter your choice");
    System.out.println("1.Simple");
    System.out.println("2.Single word at a time");
    System.out.println("3.MultiLine Print");
    System.out.print("4.MultiLetter at a time\nChoice = ");
    try {
      choice = input();
    } catch (Exception e) {
    }
    switch (choice) {
      case 1:
        simple();
        break;
      case 2:
        singleWord();
        break;
      case 3:
        multiLine();
        break;
      case 4:
        multiLetter();
        break;
      default:
        System.out.println("Enter correct option");
    }
  }

  void store() {
    hello = new char[] { 'H', 'e', 'l', 'l', 'o' };
  }

  void simple() {
    for (int z = 0; z < 5; z++) {
      try {
        Thread.sleep(500);
        System.out.print(hello[z]);
      } catch (Exception e) {
      }
    }
  }

  void singleWord() {
    for (int x = 0; x < 5; x++) {
      try {
        Thread.sleep(500);
        System.out.print(hello[x] + "\b");
      } catch (Exception e) {
      }
    }
  }

  void multiLine() {
    for (int x = 0; x < 5; x++) {
      try {
        Thread.sleep(500);
        System.out.println(hello[x]);
      } catch (Exception e) {
      }
    }
  }

  void multiLetter() {
    m = n = 0;
    try {
      while (n <= m) {
        Thread.sleep(500);
        System.out.print(hello[n]);
        if (n == m) {
          m++;
          n = -1;
          System.out.print("\n");
          if (m == 5)
            break;
        }
        n++;
      }
    } catch (Exception e) {
    }
  }

  public static void main(String[] args) throws IOException {
    ShowHellDiffWay showHellDiffWay = new ShowHellDiffWay();
    showHellDiffWay.store();
    showHellDiffWay.start();
  }
}