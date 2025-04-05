import java.io.*;

class greaterEqualto2 {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a, b, c;
        System.out.println("                   ***Enter three number***");
        System.out.print("1ST=");
        a = Integer.parseInt(br.readLine());
        System.out.print("2ND=");
        b = Integer.parseInt(br.readLine());
        System.out.print("3RD=");
        c = Integer.parseInt(br.readLine());
        System.out.println("...........");
        if (a == b && b == c) {
            System.out.println("All are equal.");
        } else if (a >= b && a >= c) {
            if (b == c) {
                System.out.println("2ND and 3RD are equal");
                System.out.println(a + " is greater.");
            } else if (a == c) {
                System.out.println("1ST and 3RD are equal.");
                System.out.println(a + " is greater");
            } else if (a == b) {
                System.out.println("1ST and 2ND are equal.");
                System.out.println(a + " is greater.");
            } else {
                System.out.println(a + " is greater.");
            }
        } else if (b >= c) {
            if (a == c) {
                System.out.println("1ST and 3RD are equal.");
                System.out.println(b + " is greater.");
            } else if (a == b) {
                System.out.println("1ST and 2ND are equal.");
                System.out.println(b + " is greater.");
            } else if (b == c) {
                System.out.println("2ND and 3RD are equal.");
                System.out.println(b + " is greater.");
            } else {
                System.out.println(b + " is greater.");
            }
        } else {
            if (a == c) {
                System.out.println("1ST and 2ND are equal.");
                System.out.println(c + " is greater.");
            } else if (a == b) {
                System.out.println("1ST and 2ND are equal.");
                System.out.println(c + " is greater.");
            } else {
                System.out.println(c + " is greater.");
            }
        }

    }
}