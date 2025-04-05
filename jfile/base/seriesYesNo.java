import java.io.*;

class seriesYesNo {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a,next, value, yes;
        a = 1;
        yes = 0;
        while (a <= 10) {
            System.out.print(a + "  ");
            next=0;
            value = a;
            while (next < yes) {
                value += 10;
                System.out.print(value + "  ");
                next += 1;
            }
            System.out.print("\n");
            if (a == 10) {
                System.out.println("Enter 0 for continue and Enter 1 for Exit.");
                a = Integer.parseInt(br.readLine());
                if (a>0)
                    break;
                yes += 1;
            }
            a += 1;
        }
    }
}
