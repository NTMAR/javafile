import java.io.*;

class Nect {
    void Disp() {
        System.out.println("My name is Nitish kumar");
    }

    void Disp(char x) {
        System.out.println("I am from Giridih");
    }

    void Disp(char z, char y) {
        System.out.println("I am studing java");
    }
}

class OverLoadThreeshNam {
    public static void main(String[] args) {
        Nect nct = new Nect();
        char x = 'a';
        nct.Disp();
        nct.Disp(x);
        nct.Disp(x,x);
    }
}