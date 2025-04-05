import java.io.*;

class taxslab {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        System.out.print("\n******************************");
        System.out.print("\n\tINCOME TAX SLAB");
        System.out.print("\n******************************");
        System.out.print("\nEnter your income::");
        a = Integer.parseInt(br.readLine());
        if (a >= 0 && a <= 300000) {
            System.out.print("You dont come under tax slab 0 %");
        } else if (a >= 300000 && a <= 600000) {
            System.out.print("Your calculated tax is 5%");
        } else if (a > 600000 && a <= 900000) {
            System.out.print("Your calculated tax is 10%");
        } else if (a >= 900000 && a <= 1200000) {
            System.out.print("Your calculated tax is 15%");
        } else if (a >= 1200000 && a <= 1500000) {
            System.out.print("Your calculated tax is 20%");
        } else {
            System.out.print("Your calculated tax is 30%");
        }
    }
}
