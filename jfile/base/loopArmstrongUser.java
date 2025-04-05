import java.io.*;

class loopArmstrongUser {
    public static void main(String[] args)
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start, end, sum, Number, rem, i, j;
        i = 1;
        j = 1;
        System.out.println("\t\t\t\t\tThis is Armstrong program\n\t\t\t\t\tEnter Only Three digit number.");
        while (i == j) {
            System.out.println("Enter starting number.");
            start = Integer.parseInt(br.readLine());
            System.out.println("Enter ending number.");
            end = Integer.parseInt(br.readLine());
            if (start < end) {
                j = 2;
                while (start <= end) {
                    Number = start;
                    sum = 0;
                    while (Number > 0) {
                        rem = Number % 10;
                        sum = sum + (rem * rem * rem);
                        Number = Number / 10;
                    }
                    if (sum == start)
                        System.out.println(start);
                    start += 1;
                }
            } else
                System.out.println("First number should less than Second number.");
        }
    }
}
