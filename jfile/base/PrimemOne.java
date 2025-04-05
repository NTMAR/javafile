import java.io.*;

class PrimemOne {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a = 1, n;
        int no_Remainder = 0;
        System.out.println("Enter a number to check Whether it  is Prime Number or not.");
        n = Integer.parseInt(br.readLine());
        while (a < n) {
            if (n % a == 0)
                no_Remainder += 1;
            if (no_Remainder == 2)
                break;
            a = a + 1;
        }
        if (no_Remainder==2)
            System.out.println("Not Prime Number.");
        else
            System.out.println("Prime Number.");
    }
}