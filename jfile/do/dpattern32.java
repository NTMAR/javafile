import java.io.*;

class dpattern32 {
    public static void main(String args[]) {
        int r, c, s, k = 1;
        r = 1;
        do {
            s = 5;
            if (r < 5) {
                do {
                    System.out.print("  ");
                    s--;
                } while (s > r);
            }
            c = 1;
            do {
                if (r < 5) {
                    if (c == 1 || c == k)
                        System.out.print("*");
                    else
                        System.out.print("m");
                } else
                    System.out.print("*");
                c++;
            } while (c <= k);
            System.out.println();
            k = k + 2;
            r++;
        } while (r <= 5);
    }
}