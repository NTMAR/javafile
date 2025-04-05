import java.io.*;

class seriesUserOne {
    public static void main(String[] args)
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, upto, a, next, value;
        for (i = 1; i == 1;) {
            System.out.println("Enter number.");
            upto = Integer.parseInt(br.readLine());
            if (upto % 10 == 0) {
                i = 2;
                for (a = 1; a <= 10; a += 1) {
                    value = a;
                    /* next will execute till the result of this expression (upto/10) */
                    for (next = 1; next <= upto / 10; next += 1) {
                        System.out.print(value + "  ");
                        value += 10;
                    }
                    System.out.print("\n");
                }
            } else
                System.out.println("\t\t\t\tEnter a number which has Zero.");
        }
    }
}
