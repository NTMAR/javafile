import java.io.*;

class countWords {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char arr[] = new char[200];
    int i, count = 1;
    System.out.println("Enter One Sentence");
    for (i = 0; i < 200; i++) {
      arr[i] = (char) br.read();
      if (arr[i] == (char) 13)
        break;
    }
    System.out.println("Words Present in sentence");
    for (i = 0; i < 200; i++) {
      if (arr[i] == (char) 13)
        break;
      if (arr[i] == (char) 32)
        count += 1;
    }
    System.out.println(count);
  }
}