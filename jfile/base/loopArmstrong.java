import java.io.*;

class loopArmstrong {
    public static void main(String[] args) {
        int a, sum, Number, rem;
        a = 100;
        while (a <= 999) {
            Number = a;
            sum = 0;
            while (Number > 0) {
                rem = Number % 10;
                sum = sum + (rem * rem * rem);
                Number = Number / 10;
            }
            if (sum == a)
                System.out.println(a);
            a += 1;
        }
    }
}
// Enter only three digit number.