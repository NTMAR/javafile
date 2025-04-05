import java.io.*;

class checkDigit {
        public static void main(String[] args)
                        throws IOException {
                InputStreamReader is = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(is);
                int number = 0;
                System.out.println("Enter a number to check digit.");
                number = Integer.parseInt(br.readLine());
                if (number >= 0 && number <= 9)
                        System.out.println("one digit number.");
                else if (number >= 10 && number <= 99)
                        System.out.println("two digit number.");
                else if (number >= 100 && number <= 999)
                        System.out.println("three digit number.");
                else if (number >= 1000 && number <= 9999)
                        System.out.println("four digit number.");
                else
                        System.out.println("Entered number is more than four digit.");
        }
}
/*
 * InputStreamReader takes only 1 to so on.. it means 1,2,3,4....
 * if we enter 0001 or more[000001] InputStreamreader takes only 1.
 */