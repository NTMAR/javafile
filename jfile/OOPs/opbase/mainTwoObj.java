import java.io.*;

class take {
  int a;
  char b;
  double c;
}
class mainTwoObj {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    take ta = new take();
    take tak = new take();
    System.out.println("Give value");
    System.out.println("Enter any decimal value");
    tak.c = Double.parseDouble(br.readLine());
    System.out.println("Enter any integer");
    tak.a = Integer.parseInt(br.readLine());
    System.out.println("Enter any character");
    tak.b = (char) br.read();
    System.out.println("1st object");
    System.out.println("Integer=" + ta.a + "\nCharacter=" + ta.b + "\nDecimal=" + ta.c);
    System.out.println("2nd object");
    System.out.println("Integer=" + tak.a + "\nCharacter=" + tak.b + "\nDecimal=" + tak.c);
  }
}