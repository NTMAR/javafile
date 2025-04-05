import java.io.*;

class Display {
     static int cont = 0;

    Display() {
        cont ++;
        System.out.println(cont + " object" + " Created");
    }
}

class NoOfObjWithStatic {
    public static void main(String[] args) throws IOException {
        Display obj = new Display();
        Display obj1 = new Display();
        Display obj2 = new Display();
        
    }
}