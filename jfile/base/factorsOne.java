import java.io.*;

class factorsOne {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int no, division;
        System.out.println("Enter any number.");
        no = Integer.parseInt(br.readLine());
        division = 1;
        while (division < no) {
            if (no % division == 0)
                System.out.println(division);
            division = division + 1;
        }
    }
}