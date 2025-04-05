import java.io.*;

class seriesYesOne {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a, next, value, yes;
        yes = 0;
        for (a = 1; a <= 10; a += 1) {
            System.out.print(a + "  ");
            value = a;
            for (next = 0; next < yes; next += 1) {
                value += 10;
                System.out.print(value + "  ");
            }
            System.out.print("\n");
            if (a == 10) {
                System.out.println("Enter 0 for continue and Enter 1 for Exit.");
                a = Integer.parseInt(br.readLine());
                if (a > 0)
                    break;
                yes += 1;
            }
        }
    }
}
