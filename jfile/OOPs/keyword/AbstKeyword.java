import java.io.*;

abstract class  Next  {
   abstract void disp();
}

class Bubble extends Next{
  void disp(){
    System.out.println("This is abstract method");
  }
}

class AbstKeyword {
  public static void main(String [] args) throws IOException{
    Bubble bulk = new Bubble();
    bulk.disp();
  }
}