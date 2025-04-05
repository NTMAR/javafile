import java.io.*;

class seriesUser {
    public static void main(String[] args)
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j, upto, r, yes, a, next, value;
        i = 1;
        j = 1;
        while (i == j) {
            System.out.println("Enter number.");
            upto = Integer.parseInt(br.readLine());
            r = upto % 10;
            if (r == 0) {
                j = 2;
                yes = upto / 10;
                a = 1;
                while (a <= 10) {
                    System.out.print(a + "  ");
                    next = 1;
                    value = a;
                    while (next < yes) {
                        value += 10;
                        System.out.print(value + "  ");
                        next += 1;
                    }
                    System.out.print("\n");
                    a += 1;
                }
            }

        }

    }
}
