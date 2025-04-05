import java.io.*;

class AscendingArray {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int i, j, min, max, a, x, choice;
    int smL[] = new int[5];
    int soT[] = new int[5];
    max = 0;
    System.out.println("Enter 5 int value");
    for (i = 0; i < 5; i++)
      smL[i] = Integer.parseInt(br.readLine());
    for (i = 0; i < 5; i++)
      if (smL[i] > max)
        max = smL[i];

    for (x = 0; x < 5; x++) {
      min = max;
      for (j = 0; j < 5; j++)
        if (min > smL[j])
          min = smL[j];
      for (a = 0; a < 5; a++)
        if (min == smL[a])
          smL[a] = max;
      soT[x] = min;
    }
    System.out.print("\t\t\tEnter Your choice\n1.Ascending order\n2.Dscending order\nchoice=");
    choice = Integer.parseInt(br.readLine());
    switch (choice) {
      case 1:
        System.out.println("Elements are");
        for (i = 0; i < 5; i++)
          System.out.println(soT[i]);
        break;
      case 2:
        System.out.println("Elements are");
        for (a = 4; a >= 0; a--)
          System.out.println(soT[a]);
        break;
      default:
        System.out.println("You Enter Wrong number.");
    }
  }
}