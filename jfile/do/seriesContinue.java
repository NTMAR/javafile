import java.io.*;
class seriesContinue {
    public static void main(String[] args)
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, value, upto, quotient, i;
        System.out.println("Enter a number.");
        upto = Integer.parseInt(br.readLine());
        a = 1;
        i=1;
        value = 1;
        quotient = upto / 10;
        do {
            System.out.print(value + "  ");
            value += 10;
            if (i == quotient) {
                i = 0;
                a += 1;
                if (a == 11)
                    break;
                value = a;
                System.out.print("\n");
            }
          i+=1;
        }while(i<=quotient);
    }
}
