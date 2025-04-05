import java.io.*;

class Next {
    int a, n, r;
    int x;

    int Act(int x) {
        a = 2;
        while (a <= x) {
            if (x % a == 0)
                break;
            a += 1;
        }
        if (a > x / 2)
            return (x);
        else
            return (0);
    }
}

class OneTo50primeNApproch {
    public static void main(String[] args) throws IOException {
        Next net = new Next();
        int j, z;
        System.out.println("Prime number are between 1 to 50 ");
        j = 2;
        while (j <= 50) {
            z = net.Act(j);
            if (z != 0)
                System.out.println(z);
            j += 1;
        }
    }
}