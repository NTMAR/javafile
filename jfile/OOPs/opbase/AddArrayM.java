import java.io.*;

class Next {
  int i, sm;

  void Act(int arr[]) {
    for (i = 0; i < 10; i++)
      sm = sm + arr[i];
    System.out.println("Sum=" + sm);
  }
}

class AddArrayM {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Next net = new Next();
    int x[] = new int[10];
    int i;
    System.out.println("Enter 10 nutral number");
    for (i = 0; i < 10; i++) {
      System.out.print("Enter " + (i + 1) + " no=");
      x[i] = Integer.parseInt(br.readLine());
    }
    net.Act(x);
  }
}