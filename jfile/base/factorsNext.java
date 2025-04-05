import java.io.*;
class factorsNext {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int no, division;
        int count = 0;
        System.out.println("Enter any number.");
        no = Integer.parseInt(br.readLine());
        division = 1;
        while (division < no) {
            if (no % division == 0)
                count = count + 1;
            division = division + 1;
        }
        if (count == 1) {
            System.out.println("No factors.");
        } else {
            division = 1;
            System.out.println("Factors are:");
            while (division < no) {
                if (no % division == 0)
                    System.out.println(division);
                division = division + 1;

            }
        }

    }
}