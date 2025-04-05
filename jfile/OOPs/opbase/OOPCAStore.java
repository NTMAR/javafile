import java.io.*;

class Next {
    char x;
    static int i = 0;
    static char Atore[] = new char[] { '0', '0', '0', '0', '0' };

    void Input() throws IOException {
        BufferedReader $traffic = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any char or number");
        x = (char) $traffic.read();
        if ((int) x >= 65 && (int) x <= 90 || (int) x >= 97 && (int) x <= 122) {
            Atore[i] = x;
            i += 1;
        }
    }
}

class OOPCAStore {
    public static void main(String[] args) throws IOException {
        Next net = new Next();
        int i = 1;
        while (i <= 5) {
            net.Input();
            i += 1;
        }
        System.out.println("Your Entered Alpahabet");
        for (int x = 0; x < 5; x++)
            System.out.println(net.Atore[x]);
    }
}
