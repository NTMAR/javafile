import java.io.*;
class Next {
  int lr, mln;

  void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter 1st number");
    lr = Integer.parseInt(br.readLine());
    System.out.println("Enter 2nd number");
    mln = Integer.parseInt(br.readLine());
    Big();
  }

  void Big() {
    if (lr > mln)
      System.out.println("Large number=" + lr);
    else
      System.out.println("Large number=" + mln);
    mol();
  }

  void mol() {
    if (lr < mln)
      lr = lr + mln - (mln = lr);
    show();
  }

  void show() {
    System.out.println("All number between " + mln + " and " + lr);
    mln+=1;
    while(mln<lr){
      System.out.println(mln);
       mln+=1;
    }
  }
}

class MethodOneCall {
  public static void main(String[] args) throws IOException {
    Next net = new Next();
    net.input();
  }
}