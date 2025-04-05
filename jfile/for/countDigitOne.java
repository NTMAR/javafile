import java.io.*;

class countDigitOne {
    public static void main(String[] args)
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int no,count,n;
        System.out.println("Enter a number");
        n = Integer.parseInt(br.readLine());
        count = 0;
        for (no = n; no>0;no/=10) {
            count += 1;
        }
        System.out.println("Number of digit are = " + count);
    }
}