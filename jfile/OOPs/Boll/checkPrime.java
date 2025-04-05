import java.io.*;

class checkPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, a;
        boolean prime;
        System.out.println("Enter number");
        n = Integer.parseInt(br.readLine());
        a = 2;
        while (a < n) {
            if (n % a == 0) {
                break;
            }
            a = a + 1;
        }
        if (a == n) {
            prime = true;
        } else {
            prime = false;
        }
        if (prime == true) {
            System.out.println("Prime Number.");
        } else {
            System.out.println("Not Prime Number.");
        }
    }
}