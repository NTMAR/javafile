import java.io.*;

class countDigit {
    public static void main(String[] args)
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int no, i, count;
        System.out.println("Enter a number");
        no = Integer.parseInt(br.readLine());
         /* 
         * if we divide 10 to 19 by 10 quotient is 1 for loop condation will false 
         * so added specified  condation for that number
         */
        if (no > 9 && no < 20 || no > 99)
            count = 1;
        else
            count = 0;
             /*
             * when no(variable) is 1, for loop condation will false 
             * that why count start with 1
             */
        for (i = 1; i <= no; i += 1) {
            count += 1;
            no /= 10;
        }
        System.out.println("Number of digit are = " + count);
    }
}