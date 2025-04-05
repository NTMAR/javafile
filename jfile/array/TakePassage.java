import java.io.*;

class TakePassage {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char arr[] = new char[500];
    int i, space = 0, line = 0, j;
    System.out.println("Enter a Sentence And 0 for Exit");
    // taking the passage
    for (i = 0; i < 500; i++) {
      arr[i] = (char) br.read();
      if (arr[i] == '0')
        break;
    }
    System.out.println("Sentence is");
    // printing passage that user give as input
    for (i = 0; i < 500; i++) {
      System.out.print(arr[i]);
      if (arr[i] == '0')
        break;
    }
    // condition for checking
    for (i = 0; i < 500; i++) {
      if (arr[i] == (char) 32) {
        if (((int) arr[i + 1] >= 65 && (int) arr[i + 1] <= 90) || ((int) arr[i + 1] >= 97 && (int) arr[i + 1] <= 122)) {
          space++;
        } else {
          for (j = i + 1; j < 500; j++)
            if (((int) arr[j] >= 65 && (int) arr[j] <= 90) || ((int) arr[j] >= 97 && (int) arr[j] <= 122)) {
              space++;
              break;
            }
        }
      }
      if (arr[i] == (char) 13)
        line++;
      if (arr[i] == '0')
        break;
    }
    System.out.println("\nNo of Words=" + (space + line));
    System.out.println("NO of line=" + line);
  }
}