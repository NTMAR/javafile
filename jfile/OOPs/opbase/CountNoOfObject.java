import java.io.*;

class Display {
    static int cont = 0;

    Display() {
        cont++;
        System.out.println(cont + " object" + " Created");
    }
}

class CountNoOfObject {
    public static void main(String[] args) throws IOException {
        Display obj = new Display();
        System.out.println("Value of count " + obj.cont);
        Display obj1 = new Display();
        System.out.println("Value of count " + obj1.cont);
        Display obj2 = new Display();
        System.out.println("Value of count " + obj2.cont);
    }
}