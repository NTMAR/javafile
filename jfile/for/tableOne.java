import java.io.*;

class tableOne {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a, n, decision = 0;
        System.out.println("Enter a number.");
        n = Integer.parseInt(br.readLine());
        for (a = 1; a <= 10; a += 1) {
            System.out.println(n + "x" + a + "=" + n * a);
            if (a == 10) {
                System.out.println("" + "Enter 1 to continue and Enter 2 to Exit.");
                decision = Integer.parseInt(br.readLine());
                if (decision == 2)
                    break;
                else {
                    a = 0;
                    System.out.println("Enter a number.");
                    n = Integer.parseInt(br.readLine());
                }
            }
        }
    }
}
