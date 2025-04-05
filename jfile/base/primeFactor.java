import java.io.*;
class primeFactor {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int no, divisor, a, count = 0, prime;
        System.out.println("Enter any number.");
        no = Integer.parseInt(br.readLine());
        divisor = 1;
        while (divisor < no) {
            if (no % divisor == 0)
                count += 1;
            divisor += 1;
        }
        if (count == 1)
            System.out.println("No factors.");
        else {
            divisor = 1;
            System.out.println("Prime Factors are:");
            while (divisor< no) {
                prime = 0;
                if (no % divisor == 0) {
                    a = 1;
                    while (a <= divisor) {
                        if (divisor % a == 0)
                            prime += 1;
                        a += 1;
                    }
                }
                if (prime == 2)
                    System.out.println(divisor);
                divisor += 1;
            }
        }

    }
}
