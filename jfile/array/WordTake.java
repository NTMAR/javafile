import java.io.*;

class WordTake {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char arr[] = new char[10];
    int i;
    int kap = 0, mol = 0, snt = 0, tog = 0, cnt = 0;
    System.out.println("Enter a word and 0 to Exit");
    for (i = 0; i < 10; i++) {
      arr[i] = (char) br.read();
      if (arr[i] == '0')
        break;
    }
    for (i = 0; i < 10; i++) {
      if ((int) arr[i] >= 65 && (int) arr[i] <= 90 || (int) arr[i] >= 97 && (int) arr[i] <= 122)
        cnt += 1;
      if (arr[i] == '0')
        break;
    }
    for (i = 0; i < 10; i++) {
      if (arr[i] == '0')
        break;
      switch (arr[i]) {
        case 'a':
          mol += 1;
          break;
        case 'b':
          mol += 1;
          break;
        case 'c':
          mol += 1;
          break;
        case 'd':
          mol += 1;
          break;
        case 'e':
          mol += 1;
          break;
        case 'f':
          mol += 1;
          break;
        case 'g':
          mol += 1;
          break;
        case 'h':
          mol += 1;
          break;
        case 'i':
          mol += 1;
          break;
        case 'j':
          mol += 1;
          break;
        case 'k':
          mol += 1;
          break;
        case 'l':
          mol += 1;
          break;
        case 'm':
          mol += 1;
          break;
        case 'n':
          mol += 1;
          break;
        case 'o':
          mol += 1;
          break;
        case 'p':
          mol += 1;
          break;
        case 'q':
          mol += 1;
          break;
        case 'r':
          mol += 1;
          break;
        case 's':
          mol += 1;
          break;
        case 't':
          mol += 1;
          break;
        case 'u':
          mol += 1;
          break;
        case 'v':
          mol += 1;
          break;
        case 'w':
          mol += 1;
          break;
        case 'x':
          mol += 1;
          break;
        case 'y':
          mol += 1;
          break;
        case 'z':
          mol += 1;
          break;
        case 'A':
          kap += 1;
          break;
        case 'B':
          kap += 1;
          break;
        case 'C':
          kap += 1;
          break;
        case 'D':
          kap += 1;
          break;
        case 'E':
          kap += 1;
          break;
        case 'F':
          kap += 1;
          break;
        case 'G':
          kap += 1;
          break;
        case 'H':
          kap += 1;
          break;
        case 'I':
          kap += 1;
          break;
        case 'J':
          kap += 1;
          break;
        case 'K':
          kap += 1;
          break;
        case 'L':
          kap += 1;
          break;
        case 'M':
          kap += 1;
          break;
        case 'N':
          kap += 1;
          break;
        case 'O':
          kap += 1;
          break;
        case 'P':
          kap += 1;
          break;
        case 'Q':
          kap += 1;
          break;
        case 'R':
          kap += 1;
          break;
        case 'S':
          kap += 1;
          break;
        case 'T':
          kap += 1;
          break;
        case 'U':
          kap += 1;
          break;
        case 'V':
          kap += 1;
          break;
        case 'W':
          kap += 1;
          break;
        case 'X':
          kap += 1;
          break;
        case 'Y':
          kap += 1;
          break;
        case 'Z':
          kap += 1;
          break;
        default:
          System.out.print("");
      }
    }
    if (cnt == kap)
      System.out.println("All letter are capital");
    if (cnt == mol)
      System.out.println("All letter are small");
    if (((int) arr[0] >= 97 && (int) arr[0] <= 122) && kap == 1)
      System.out.println("Word is in sentence");
  }
}