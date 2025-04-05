import java.io.*;

class reportcard {
    public static void main(String args[])
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter your name : ");
        String name = br.readLine();

        int a, b, c, d, e, sum;
        double percentage;

        // SUBJECT

        System.out.print("\nEnter your Mathematics marks: ");
        a = Integer.parseInt(br.readLine());
        if (a <= 100 && a >= 0) { // input row 1 'if' opened

            System.out.print("\nEnter your Physics marks: ");
            b = Integer.parseInt(br.readLine());
            if (b <= 100 && b >= 0) { // input row 2 'if' opened

                System.out.print("\nEnter your Chemistry marks: ");
                c = Integer.parseInt(br.readLine());
                if (c <= 100 && c >= 0) { // input row 3 'if' opened

                    System.out.print("\nEnter your English marks: ");
                    d = Integer.parseInt(br.readLine());
                    if (d <= 100 && d >= 0) { // input row 4 'if' opened

                        System.out.print("\nEnter your Hindi makrs: ");
                        e = Integer.parseInt(br.readLine());
                        if (e <= 100 && e >= 0) { // input row 5 'if' opened

                            System.out.println("      ");
                            System.out.println("\t   Report card of " + name);
                            System.out.println("\t-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                            System.out.println("_________________________________________________________________");
                            System.out.println("S.no:. \t Subject \t Full marks \t Obtained marks \tgrade ");

                            // Row 1

                            System.out.print("\n1. \t Mathematics \t\t 100 \t\t" + a + "\t\t");

                            if (a >= 75)
                                System.out.println("D");
                            else if (a < 33)
                                System.out.println("*");
                            else
                                System.out.println(" ");

                            // Row 2

                            System.out.print("\n2. \t Physics \t\t 100 \t\t" + b + "\t\t");

                            if (b >= 75)
                                System.out.println("D");
                            else if (b < 33)
                                System.out.println("*");
                            else
                                System.out.println(" ");

                            // Row 3

                            System.out.print("\n3. \t Chemistry \t\t 100 \t\t" + c + "\t\t");

                            if (c >= 75)
                                System.out.println("D");
                            else if (c < 33)
                                System.out.println("*");
                            else
                                System.out.println(" ");

                            // Row 4

                            System.out.print("\n4. \t English \t\t 100 \t\t" + d + "\t\t");

                            if (d >= 75)
                                System.out.println("D");
                            else if (d < 33)
                                System.out.println("*");
                            else
                                System.out.println(" ");

                            // Row 5

                            System.out.print("\n5. \t Hindi \t\t\t 100 \t\t" + e + "\t\t");

                            if (e >= 75)
                                System.out.println("D");
                            else if (e < 33)
                                System.out.println("*");
                            else
                                System.out.println(" ");

                            // CALCULATION

                            sum = a + b + c + d + e;
                            percentage = sum * 100.00 / 500;

                            // LAST OPERATION

                            System.out.println("_____________________________________________________________________");
                            System.out.print("Total marks=500 \t Obtained marks=" + sum + "\t percentage =" + percentage+ " % \t Status =");

                            // DIVISION CHECK

                            if (a < 33 || b < 33 || c < 33 || d < 33 || e < 33)
                                System.out.print("Failed");
                            else if (percentage >= 60)
                                System.out.print("First Division");
                            else if (percentage < 60 && percentage >= 45)
                                System.out.print("Second Division");
                            else
                                System.out.print("Third Division");
                        } // input row 5 closed

                        else
                            System.out.print("Invalid marks ");

                    } // input row 4 closed

                    else
                        System.out.print("Invalid marks ");

                } // input row 3 closed

                else
                    System.out.print("Invalid marks ");

            } // input row 2 closed

            else
                System.out.print("Invalid marks");

        } // input row 1 closed

        else
            System.out.print("Invalid marks ");

    }
}