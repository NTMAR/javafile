import java.io.*;

class Next {
  int i, max, min, s, z, a;

  void Show(int arr[]) {
    max = 0;
    for (a = 0; a < 5; a++)
      if (arr[a] > max)
        max = arr[a];

    System.out.println("Largest = " + max);
  }

  void Show(int arr[], int x) {
    min = arr[0];
    for (z = 0; z < 5; z++) {
      if (arr[z] < min)
        min = arr[z];
    }
    System.out.println("Smallest = " + min);
  }

  void Show(int arr[], int y, int z) {
    for (s = 0; s < 5 / 2;) {
      if (arr[s] == arr[4 - s])
        s++;
      else
        break;
    }
    if (s == 5 / 2)
      System.out.println("Array elements is palindrome");
    else
      System.out.println("Array elements is not palindrome");
  }
}

class arrYINpalindrom {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Next net = new Next();
    int arr[] = new int[5];
    int i, x = 0;
    System.out.println("Enter 5 elements");
    for (i = 0; i < 5; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    net.Show(arr);
    net.Show(arr, x);
    net.Show(arr, x, x);
  }
}