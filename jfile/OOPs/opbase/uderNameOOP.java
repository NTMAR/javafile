import java.io.*;

class Bubble {
  int i, cnt, x;

  void Act(char name[]) {
    cnt = 0;
    for (i = 0; i < 20; i++) {
      if (name[i] != '0')
        cnt += 1;
    }
    System.out.print("Reverse is ");
    for (x = cnt; x >= 0; x--)
      System.out.print(name[x]);
  }
}

class uderNameOOP {
  public static void main(String[] args) throws IOException {
    BufferedReader $traffic = new BufferedReader(new InputStreamReader(System.in));
    Bubble bulb = new Bubble();
    char uder[] = new char[20];
    System.out.println("Enter your name");
    for (int x = 0; x < 20; x++) {
      uder[x] = (char) $traffic.read();
      if (uder[x] == '0')
        break;
    }
    bulb.Act(uder);
  }
}