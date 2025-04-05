import java.io.*;

class counting {
    public static void main(String args[])
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s, e, ch, i, t;
        ch = 1;
        i = 0;
        while (ch == 1) {
            s = 1;
            while (s <= 10) {
                System.out.print(s + "  ");
                e = 0;
                t = s;
                while (e < i) {
                    System.out.print(t + 10 + "  ");
                    e++;
                    t = t + 10;
                }
                System.out.print("\n");
                s++;
            }
            System.out.println("do u want to continue y=1");
            ch = Integer.parseInt(br.readLine());
            i++;
        }
    }
}