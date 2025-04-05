import java.io.*;

final class Next {
  void disp() {
    System.out.println("My name is Nitish kumar");
  }
}

class Test extends Next {
  void show() {
    System.out.println("My friend is ...");
  }
}

class FianlClas {
  public static void main(String[] args) throws IOException {
    Test obj = new Test();
    obj.disp();
    obj.show();
  }
}