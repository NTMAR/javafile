import java.io.*;

class Next {
    int i, value, a;

    void Act() {
        a = 1;
        value = 1;
        for (i = 1; i <= 5; i += 1) {
            System.out.print(value + "  ");
            value += 10;
            if (i == 5) {
                i = 0;
                a += 1;
                if (a == 11)
                    break;
                value = a;
                System.out.print("\n");
            }
        }
    }
}

class MehodSeries {
    public static void main(String[] args) {
        Next net = new Next();
        net.Act();
    }
}