import java.io.*;

class Bubble {
  int i;

  void Action(int arr[]) {
    for (i = 0; i < 5; i++)
      System.out.println(arr[i]);
  }
}

class ShowArrayOOP {
  public static void main(String[] args) throws IOException {
    BufferedReader $traffic = new BufferedReader(new InputStreamReader(System.in));
    Bubble bulb = new Bubble();
    int Uder[] = new int[5];
    System.out.println("Enter 5 value");
    for (int x = 0; x < 5; x++) {
      System.out.print("Enter " + (x + 1) + " Value=");
      Uder[x] = Integer.parseInt($traffic.readLine());
    }
    bulb.Action(Uder);

  }
}