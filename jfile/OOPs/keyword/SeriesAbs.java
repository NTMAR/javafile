import java.io.*;

abstract class Next {
    abstract void series(int p, int r, int t);

    abstract void series(int x);
}

class Bulb extends Next {
    int z;

    void series(int p, int r, int t) {
        int si = (p * r * t) / 100;
        System.out.println("Simple interest is " + si);
    }

    void series(int x) {
        System.out.println("Prime numbers are");
        for (int j = 1; j < 51; j++) {
            for (z = x; z < j; z++) {
                if (j % z == 0) {
                    break;
                }
            }
            if (z == j)
                System.out.println(j);
        }
    }
}

class SeriesAbs {
    public static void main(String[] args) {
        Bulb net = new Bulb();
        net.series(1000, 4, 2);
        net.series(2);
    }
}