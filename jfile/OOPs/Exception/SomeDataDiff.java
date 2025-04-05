import java.io.*;

class Next {
    int a, b;

    void act() {
        System.out.println(a + "" + b);
    }
}

/* This program give exception because the name */
/* of file not save as main class name here SomeDataDiffNme */
/* Exception is NoClassDefFoundError */

class SomeDataDiffNme {
    public static void main(String[] args) {
        Next net = new Next();
        net.act();
    }
}