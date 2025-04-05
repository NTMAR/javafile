import java.io.*;

class Next {
    int a, b, c, d, e;

    Next() {
        a = b = c = d = e = 0;
    }

    Next(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    Next(int u, int v, int x, int y, int z) {
        a = u;
        b = v;
        c = x;
        d = y;
        e = z;
    }

    void Act() {
        e = a + b + c + d;
        System.out.println("The addation is e = " + e);
    }
}

class ManyCon {
    public static void main(String[] args) throws IOException {
        Next obj1 = new Next();
        obj1.Act();
        Next obj2 = new Next(10, 20, 30);
        obj2.Act();
        Next obj3 = new Next(10, 20, 30, 40, 0);
        System.out.println("The value of e = " + obj3.e);
        obj3.Act();
    }
}