import java.io.*;

class Bubble {
    int r, sum, k;

    void Act(int FT, int ED) {
        System.out.println("Palindrome number are");
        while (FT <= ED) {
            k = FT;
            sum = 0;
            while (k > 0) {
                r = k % 10;
                sum = sum + (r * r * r);
                k = k / 10;
            }
            if (sum == FT)
                System.out.println(FT);
            FT += 1;
        }
    }
}

class BetweenPalindOOP {
    public static void main(String[] args) throws IOException {
        BufferedReader $traffic = new BufferedReader(new InputStreamReader(System.in));
        Bubble bulb = new Bubble();
        System.out.println("Enter 1st number");
        int x = Integer.parseInt($traffic.readLine());
        System.out.println("Enter 2nd number");
        int y = Integer.parseInt($traffic.readLine());
        bulb.Act(x, y);
    }
}
