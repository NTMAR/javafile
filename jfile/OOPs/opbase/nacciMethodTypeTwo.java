import java.io.*;

class Next {
    static int c = 1;

    void Act(int a, int b) {
        while (c < 100) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(c);
        }
    }
}

class nacciMethodTypeTwo {
    public static void main(String[] args) {
        Next net = new Next();
        int x, y;
        x = 0;
        y = 0;
        net.Act(x, y);
    }
}