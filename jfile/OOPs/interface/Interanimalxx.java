import java.io.*;

interface animal {
  void sound();
}

class Dog implements animal {
  public void sound() {
    System.out.println("Bark");
  }
}

class Cat implements animal {
  public void sound() {
    System.out.println("Meow");
  }
}

class Goat implements animal {
  public void sound() {
    System.out.println("Bleat");
  }
}

class Lion implements animal {
  public void sound() {
    System.out.println("Roar");
  }
}

class Interanimalxx {
  public static void main(String[] args) throws IOException {
    Dog toneOne = new Dog();
    Cat toneTwo = new Cat();
    Goat toneThree = new Goat();
    Lion toneFor = new Lion();
    toneOne.sound();
    toneTwo.sound();
    toneThree.sound();
    toneFor.sound();
  }
}