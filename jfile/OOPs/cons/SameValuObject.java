import java.io.*;

class Next {
       int a,b;

  Next(int a,int b) {
    this.a = a;
    this.b = b;
  }

  void Display() {
    System.out.println("a="+a+"\nb="+b);
  }
}
class SameValuObject{
      public static void main(String [] args) throws IOException{
        Next net = new Next(10,12);
        net.Display();
      }
}