import java.io.*;

class Short {
    static int i, cq;

    void call(int a) {
        cq = i = 1;
        do {
            cq = cq * i;
            i += 1;
        } while (i <= a);
        System.out.println("factorial of " + a + " is " + cq);
    }
}

class Down extends Short {
    int k;

    void Input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any natural number");
        k = Integer.parseInt(br.readLine());
        call(k);
    }
}

class FaxOfNumb {
    public static void main(String[] args) throws IOException {
        Down vet = new Down();
        vet.Input();
    }
}
