import java.io.*;

class primeMtwo {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a, n;
        System.out.println("Enter a number to check Whether it  is Prime Number or not.");
        n = Integer.parseInt(br.readLine());
        a=2;
        while (a < n) {
            if (n % a == 0) {
                break;
            }
            a=a+1;
        }
        if (a == n)
            System.out.println("Prime Number.");
        else
            System.out.println(" Not Prime Number.");
    }
}
