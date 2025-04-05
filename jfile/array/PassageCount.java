import java.io.*;

class PassageCount {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char pass[] = new char[200];
    int i, word = 0, line = 0, j;
    for (i = 0; i < 200; i++)
      pass[i] = '0';
    System.out.println("Enter passage");
    for (i = 0; i < 200; i++) {
      pass[i] = (char) br.read();
      if (pass[i] == '0')
        break;
    }
    for (j = 0; j < 200; j++) {
      if (pass[j] == (char) 32)
        word += 1;
      if (pass[j] == (char) 13)
        line += 1;
      if (pass[j] == '0')
        break;
    }
    System.out.println("Line=" + line);
    System.out.println("Word=" + (word + line));

  }
}