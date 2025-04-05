import java.io.*;

class Next {
    static int c=1,a=0,b=0;

    int Act() {
        a = b;
        b = c;
        c = a + b;
        return (c);
    }
}

class nacciTypeThree {
    public static void main(String[] args) {
        Next net = new Next();
        int z, x;
        z = 1;
        while (z <= 10) {
            x = net.Act();
            System.out.println(x);
            z += 1;
        }
    }
}