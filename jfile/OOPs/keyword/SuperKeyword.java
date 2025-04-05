import java.io.*;

abstract class Dog {
  String s;

  Dog(String sound) {
    s = sound;
  }

  void disp() {
    System.out.println(s);
  }
}

class Puppy extends Dog {

  Puppy(String msg) {
    super(msg);
  }
}

class SuperKeyword {
  public static void main(String[] args) throws IOException {
    Puppy pup = new Puppy("Dog is Barking");
    pup.disp();
  }
}