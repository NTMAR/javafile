import java.io.*;

class Next {
    int i;
    static int a = 1;

    int Act() {
        i = a;
        a += 1;
        return (i);
    }
}

class metodSerthree {
    public static void main(String[] args) throws IOException {
        Next net = new Next();
        for (int i = 1; i < 51; i++) {
            int a = net.Act();
            System.out.println(a);
        }

    }
}