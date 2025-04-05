import java.io.*;

class Next {
  int a, i, min, max;

  void minimum(int mn[], int sc) {
    min = mn[0];
    for (a = 0; a < sc; a++) {
      if (mn[a] < min)
        min = mn[a];
    }
    System.out.println("Smallest=" + min);
    maximum(mn, sc);
  }

  void maximum(int mx[], int bc) {
    max = 0;
    for (a = 0; a < bc; a++) {
      if (mx[a] > max)
        max = mx[a];
    }
    System.out.println("Largest=" + max);
  }
}

class LarArrayM {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x[];
    int sze, i;
    Next net = new Next();
    System.out.println("Enter Size of Array");
    sze = Integer.parseInt(br.readLine());
    x = new int[sze];
    for (i = 0; i < sze; i++) {
      System.out.print("Enter " + (i + 1) + " no=");
      x[i] = Integer.parseInt(br.readLine());
    }
    net.minimum(x, sze);
  }
}