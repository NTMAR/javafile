import java.io.*;

class Next {
    static int value = 1;
    static int i;
    static int a = 1;

    int Act() {
        for (i = 1; i <= 5; i += 1) {
            value = value + 10;
               return (value);
            if (i == 5) {
                i = 0;
                a += 1;
                value = a;
            }
        }
    }
}

class MehodSeriesPartTwo {
    public static void main(String[] args) {
        Next net = new Next();
        int z = net.Act();
        System.out.println(z);
    }
}