import java.io.*;

class UserInput {
  char c;
  int n;

  char input() throws IOException {
    BufferedReader br =  new BufferedReader (new InputStreamReader(System.in));
    c = (char)br.read();
    return (c);
  }

   int natInput() throws IOException {
    BufferedReader br =  new BufferedReader (new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    return (n);
  }

}

class Next {
  void call() throws IOException {
    UserInput userInput = new UserInput();
    System.out.println("Enter 1st letter");
    char x = userInput.input();
    System.out.println("Enter 2nd letter");
    char y = userInput.input();
    System.out.println("Enter 1st number");
    int a = userInput.natInput();
    System.out.println("Enter 2nd number");
    int b = userInput.natInput();
    System.out.println(x+""+y);
    System.out.println(a+""+b);
  }
}

class TakeFunDef{
  public static void main(String [] args) throws IOException {
    Next net = new Next();
    net.call();
  }
}