import java.io.*;

class Next {
    static int c = 1;

    int Act(int a, int b) {
        c = a + b;
        return (c);
    }
}

class nacciTypeFour {
    public static void main(String[] args) {
        Next net = new Next();
        int z, x, a, b, c;
        a = b = 0;
        z = c = 1;
        while (z <= 10) {
            a = b;
            b = c;
            x = net.Act(a, b);
            System.out.println(x);
            c = x;
            z += 1;
        }
    }
}