import java.io.*;

class PatMain {
    public static void main(String[] args) throws IOException {
        int i, j, value, p, n, colm, rows;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number to print series:");
        n = Integer.parseInt(br.readLine());
        colm = n / 10;
        rows = 9 + colm - 10;
        for (i = 1; i <= 10; i += 1) {
            value = i;
            for (j = 1; j <= i; j++) {
                System.out.print(value + "\t");
                value -= 1;
                value += 10;
            }
            System.out.print("\n");
        }
        p = i;
        for (i = 1; i <= rows; i += 1) {
            value = p;
            for (j = 1; j <= colm; j++) {
                if (j >= i) {
                    System.out.print(value + "\t");
                } else {
                    System.out.print("\t");
                }
                value -= 1;
                value += 10;
            }
            p += 1;
            System.out.print("\n");
        }
    }
}
