import java.io.*;

class Next {
  int sm, pls, k = 0, p = 0, i, j, n, res, u, v, a, b, ts;
  double xv;
  int Odd[];
  int Even[];

  void odd(int odi[], int y) {
    Odd = new int[y];
    for (i = 0; i < y; i++) {
      if (odi[i] % 2 == 1) {
        Odd[k] = odi[i];
        k += 1;
      }
    }
    even(odi, y);
    AddO(Odd, y);
  }

  void even(int evi[], int y) {
    Even = new int[y];
    for (j = 0; j < y; j++) {
      if (evi[j] % 2 == 0) {
        Even[p] = evi[j];
        p += 1;
      }
    }
    AddE(Even, y);
  }

  void AddO(int asp[], int s) {
    for (u = 0; u < s; u++) {
      pls = pls + asp[u];
    }
    System.out.println("Sum of Odd Number="+pls);
    Avge(pls,res,s);
  }

  void AddE(int xsp[], int ks) {
    for (v = 0; v < ks; v++) {
      res = res + xsp[v];
    }
    System.out.println("Sum of Even Number="+res);
  }

  void Avge(int dps, int bs ,int y) {
    xv=(dps+bs)/y;
    System.out.println("Averge=" + xv);
  }
}

class AddEnOddAryM {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Next net = new Next();
    int x[], i, sze;
    System.out.println("Enter size of Array");
    sze = Integer.parseInt(br.readLine());
    x = new int[sze];
    for (i = 0; i < sze; i++) {
      System.out.print("Enter " + (i + 1) + " no.=");
      x[i] = Integer.parseInt(br.readLine());
    }
    net.odd(x, sze);
  }
}