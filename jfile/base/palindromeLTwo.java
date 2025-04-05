import java.io.*;

class palindromeLTwo {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int number, digit = 0, backup, reverse = 0, a, b;
        System.out.println("Enter any number.");
        number = Integer.parseInt(br.readLine());
        backup = number;
        a = 1;
        while (number > 0) {
            b = 1;
            while (number > 0) {
                digit = number % 10;
                reverse =   digit*(a = a * b)+reverse ;
                number = number / 10;
                b = 10;
            }

        }
        if (backup == reverse)
            System.out.println("Number is palindrome.");
        else
            System.out.println("Number is not Palindrome.");

    }
}
