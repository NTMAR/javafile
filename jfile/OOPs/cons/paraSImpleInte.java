import java.io.*;

class Next {
    int a, b, c, sp;

    Next(int p, int t, int r) {
        a = p;
        b = t;
        c = r;
    }

    void call() {
        sp = (a * b * c) / 100;
        System.out.println("Interest is " + sp);
    }
}

class paraSImpleInte {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Principal Amt");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Enter rate ");
        int y = Integer.parseInt(br.readLine());
        System.out.println("Enter time");
        int z = Integer.parseInt(br.readLine());
        Next net = new Next(x, y, z);
        net.call();
    }
}
