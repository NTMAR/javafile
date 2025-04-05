import java.io.*;

class Next {
    static int c = 1, a = 0, b = 0;

    int Act(int x) {
            a = b;
            b = c;
            c = a + b;
            return (c);
    }
}

class nacciDiffeMethFour {
    public static void main(String[] args) {
        Next net = new Next();
        int z, x, a;
        z = 1;
        a = 100;
        while (z <= 100) {
            x = net.Act(a);
            System.out.println(x);
            z = x;
        }
    }
}