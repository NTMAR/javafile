import java.io.*;

class primeTwo {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a , n;
        int no_Remainder;
        System.out.println("Enter a number to check Whether it  is Prime Number or not.");
        n = Integer.parseInt(br.readLine());
        no_Remainder=0;
        for (a=1;a < n; a += 1) {
            if (n % a == 0)
                no_Remainder += 1;
            if (no_Remainder == 2)
                break;
        }
        if (no_Remainder==2)
            System.out.println("Not Prime Number.");
        else
            System.out.println("Prime Number.");
    }
}
