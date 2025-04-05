import java.io.*;

class NestingTry {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
         int x;
        try {
            try {
                try {  
                    System.out.println("Enter any number");
                    x = Integer.parseInt(br.readLine());
                    System.out.println(x / 0);
                } catch (ArithmeticException ae) {
                    System.out.println("Exception handled 1");
                }
            } catch (NumberFormatException ne) {
                System.out.println("Exception handled 2");
                System.out.println("Enter any number");
                x = Integer.parseInt(br.readLine());
                System.out.println(x / 0);
            }
        } catch (NumberFormatException ae) {
            System.out.println("Better luck \nnext time");
        }
    }
}