import java.io.*;

class Next {
    int x;

    int $plus(int a, int b) {
        return (a + b);
    }
}

class AddSumOOp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Next net = new Next();
        System.out.println("Enter any number");
        int w = Integer.parseInt(br.readLine());
        System.out.println("Enter any number");
        int y = Integer.parseInt(br.readLine());
        net.x = net.$plus(w, y);
        System.out.println("Sum is = " + net.x);
    }
}